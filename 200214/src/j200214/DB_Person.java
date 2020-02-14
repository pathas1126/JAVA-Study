package j200214;

// j200213.DB_Person 메소드 분리

import java.sql.*;

import java.awt.*;

// 이벤트 처리 패키지, ActionEvent -> ActionListener 
import java.awt.event.*;
import javax.swing.*;

// DefaultTableModel 클래스 사용을 위함
// Model을 하나의 객체로 저장하는 클래스
import javax.swing.table.*;

public class DB_Person extends JFrame implements ActionListener {

	// =============DB ==============
	// DB 연결 객체 생성
	Connection conn;
	// DDL
	Statement st;

	// 매개변수가 있는 SQL문장
	PreparedStatement ps;

	// DB url
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	// 쿼리 검색 결과
	ResultSet rs;

	// =============DB ==================

	// 텍스트 필드명을 표시하기 위한 JLabel, 이름, 나이, 전화 번호
	JLabel l1, l2, l3;

	// 입력을 받기 위한 텍스트 필드
	JTextField tf1, tf2, tf3;

	// 다른 컴포넌트를 포함할 수 있음, 영역 구분시 사용
	JPanel panel;

	// JTable
	JTable table;

	// JTable에서 데이터(로우) 부분
	Object ob[][] = new Object[0][3];

	// 데이터 저장 영역
	DefaultTableModel model;

	// 스크롤 바
	JScrollPane js;

	// 컬럼명
	String str[] = { "이름", "나이", "전화번호" };

	// 생성자
	public DB_Person() {
		super("테이블에 데이터 입력하기");

		// JPanel 생성
		panel = new JPanel();
		panel.setBackground(new Color(0, 215, 255));

		// JLabel 생성, JLabel("칼럼명", 칼럼명 정렬 기준)
		l1 = new JLabel("이름", JLabel.CENTER);
		l2 = new JLabel("나이", JLabel.LEFT);
		l3 = new JLabel("전화번호", JLabel.RIGHT);

		// JTextField 생성
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		// GridLayout, Panel을 3행 2열로 만들기
		panel.setLayout(new GridLayout(3, 2));

		// Label - TextField 순으로 생성
		panel.add(l1);
		panel.add(tf1);
		panel.add(l2);
		panel.add(tf2);
		panel.add(l3);
		panel.add(tf3);

		// 패널을 JFrame 위쪽에 부착, 반대로 써도 상관 없음
		this.add(panel, "North");

		// JTable에 Model 부착
		model = new DefaultTableModel(ob, str); // 매개변수: rowData, columnNames
		table = new JTable(model); // 매개변수로 DefaultTableModel 객체 전달

		// JScrollPane
		js = new JScrollPane(table);
		this.add(js, "Center");

		// X버튼 클릭시 정상 종료되도록 함, DB 관련 객체가 메모리에서 해제되지 않기 때문에 바로 사용X
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 화면에 출력
		this.setBounds(1250, 250, 400, 600);

		// X 버튼 클릭시 DB 객체 메모리 해제 및 프로그램 완전 종료
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});

		this.setVisible(true);

		// TextField에 이벤트(enter) 연결, JTableTest2 객체에서 처리(actionPerformed 메소드)
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);

		try {
			// 객체 생성시 DB와 연결 시도
			connect();

			// PERSON 테이블이 없는 경우 테이블 생성
			create();

			// 실행시 기존 테이블에 저장된 데이터 출력
			select(ob);

		} catch (Exception displayError) {
			System.out.println(displayError);
		}

	}

	// DB 접속, 외부에서 접속하면 안 되기 때문에 private 선언
	private void connect() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println(conn);
	}

	// Table 생성 메소드, 없는 경우에만 생성
	private void create() throws Exception {
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM PERSON");
		} catch (Exception createError) {
			System.out.println(createError);
			int resSt1 = st.executeUpdate("CREATE TABLE PERSON(NAME VARCHAR2(15), AGE VARCHAR2(3), TEL VARCHAR2(20))");
			System.out.println("테이블 생성: " + resSt1);
		}

	}

	// SELECT
	public void select(Object[] ob) {
		try {
			rs = st.executeQuery("SELECT * FROM PERSON");
			ob = new Object[3];

			while (rs.next()) {
				ob[0] = rs.getString("NAME");
				ob[1] = rs.getString("AGE");
				ob[2] = rs.getString("TEL");
				model.addRow(ob);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// INSERT
	public void insert(Object[] data) {
		try {
			// 매개 변수 SQL문, 데이터 입력
			ps = conn.prepareStatement("INSERT INTO PERSON VALUES(?, ?, ?)");
			ps.setString(1, data[0].toString());
			ps.setString(2, data[1].toString());
			ps.setString(3, data[2].toString());
			int insert = ps.executeUpdate();
			System.out.println("insert: " + insert);

			// 기존 Model에 data 추가
			model.addRow(data);

		} catch (Exception ee) {
			System.out.println(ee);
		}
	}

	// CLOSE 메소드, X버튼 클릭시 호출
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (Exception closeException) {
			System.out.println("close에러>>>>>" + closeException);
		}
	}

	// Event 처리 메소드
	public void actionPerformed(ActionEvent e) {
		// e.getSource() → 이벤트 발생 컴포넌트를 얻어옴
		if (e.getSource() == tf1) { // 이름
			// tf2로 커서 이동
			tf2.requestFocus();
		} else if (e.getSource() == tf2) { // 나이
			tf3.requestFocus();
		} else if (e.getSource() == tf3) { // 전화 번호
			// 텍스트 필드에 아무것도 작성하지 않은 경우에 알림창을 띄움
			if (tf1.getText().equals("") && tf2.getText().equals("") && tf3.getText().equals("")) {
				// 형식) JOptionPane.showMessageDialog(부모객체명, 경고메세지)
				JOptionPane.showMessageDialog(this, "텍스트 필드를 입력해 주세요.");
				tf1.requestFocus();
				return;
			}

			// 입력 받은 값을 배열로 저장 ∵ Table의 row가 배열 형태이기 때문에
			Object data[] = { tf1.getText(), tf2.getText(), tf3.getText() };

			// 텍스트 필드 초기화
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");

			tf1.requestFocus();

			// 데이터 입력
			insert(data);

		}
	}

	public static void main(String[] args) {

		new DB_Person();

	}

}
