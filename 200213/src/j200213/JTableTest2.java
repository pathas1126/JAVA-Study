package j200213;

import java.awt.*;
// 이벤트 처리 패키지, ActionEvent -> ActionListener 
import java.awt.event.*;
import javax.swing.*;

// DefaultTableModel 클래스 사용을 위함
// Model을 하나의 객체로 저장하는 클래스
import javax.swing.table.*;

public class JTableTest2 extends JFrame implements ActionListener {

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
	public JTableTest2() {
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

		// X버튼 클릭시 정상 종료되도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 화면에 출력
		this.setBounds(1250, 250, 400, 600);
		this.setVisible(true);

		// TextField에 이벤트(enter) 연결, JTableTest2 객체에서 처리(actionPerformed 메소드)
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
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

			// Model에 데이터 입력
			// 형식) Model 객체명.addRow(저장할 값 => 배열 값)
			model.addRow(data);

			// 텍스트 필드 초기화
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");

			tf1.requestFocus();

		}
	}

	public static void main(String[] args) {
		new JTableTest2();
	}

}
