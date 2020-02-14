package j200214;

// j200213.DB_Person �޼ҵ� �и�

import java.sql.*;

import java.awt.*;

// �̺�Ʈ ó�� ��Ű��, ActionEvent -> ActionListener 
import java.awt.event.*;
import javax.swing.*;

// DefaultTableModel Ŭ���� ����� ����
// Model�� �ϳ��� ��ü�� �����ϴ� Ŭ����
import javax.swing.table.*;

public class DB_Person extends JFrame implements ActionListener {

	// =============DB ==============
	// DB ���� ��ü ����
	Connection conn;
	// DDL
	Statement st;

	// �Ű������� �ִ� SQL����
	PreparedStatement ps;

	// DB url
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	// ���� �˻� ���
	ResultSet rs;

	// =============DB ==================

	// �ؽ�Ʈ �ʵ���� ǥ���ϱ� ���� JLabel, �̸�, ����, ��ȭ ��ȣ
	JLabel l1, l2, l3;

	// �Է��� �ޱ� ���� �ؽ�Ʈ �ʵ�
	JTextField tf1, tf2, tf3;

	// �ٸ� ������Ʈ�� ������ �� ����, ���� ���н� ���
	JPanel panel;

	// JTable
	JTable table;

	// JTable���� ������(�ο�) �κ�
	Object ob[][] = new Object[0][3];

	// ������ ���� ����
	DefaultTableModel model;

	// ��ũ�� ��
	JScrollPane js;

	// �÷���
	String str[] = { "�̸�", "����", "��ȭ��ȣ" };

	// ������
	public DB_Person() {
		super("���̺� ������ �Է��ϱ�");

		// JPanel ����
		panel = new JPanel();
		panel.setBackground(new Color(0, 215, 255));

		// JLabel ����, JLabel("Į����", Į���� ���� ����)
		l1 = new JLabel("�̸�", JLabel.CENTER);
		l2 = new JLabel("����", JLabel.LEFT);
		l3 = new JLabel("��ȭ��ȣ", JLabel.RIGHT);

		// JTextField ����
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		// GridLayout, Panel�� 3�� 2���� �����
		panel.setLayout(new GridLayout(3, 2));

		// Label - TextField ������ ����
		panel.add(l1);
		panel.add(tf1);
		panel.add(l2);
		panel.add(tf2);
		panel.add(l3);
		panel.add(tf3);

		// �г��� JFrame ���ʿ� ����, �ݴ�� �ᵵ ��� ����
		this.add(panel, "North");

		// JTable�� Model ����
		model = new DefaultTableModel(ob, str); // �Ű�����: rowData, columnNames
		table = new JTable(model); // �Ű������� DefaultTableModel ��ü ����

		// JScrollPane
		js = new JScrollPane(table);
		this.add(js, "Center");

		// X��ư Ŭ���� ���� ����ǵ��� ��, DB ���� ��ü�� �޸𸮿��� �������� �ʱ� ������ �ٷ� ���X
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ȭ�鿡 ���
		this.setBounds(1250, 250, 400, 600);

		// X ��ư Ŭ���� DB ��ü �޸� ���� �� ���α׷� ���� ����
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});

		this.setVisible(true);

		// TextField�� �̺�Ʈ(enter) ����, JTableTest2 ��ü���� ó��(actionPerformed �޼ҵ�)
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);

		try {
			// ��ü ������ DB�� ���� �õ�
			connect();

			// PERSON ���̺��� ���� ��� ���̺� ����
			create();

			// ����� ���� ���̺� ����� ������ ���
			select(ob);

		} catch (Exception displayError) {
			System.out.println(displayError);
		}

	}

	// DB ����, �ܺο��� �����ϸ� �� �Ǳ� ������ private ����
	private void connect() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println(conn);
	}

	// Table ���� �޼ҵ�, ���� ��쿡�� ����
	private void create() throws Exception {
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM PERSON");
		} catch (Exception createError) {
			System.out.println(createError);
			int resSt1 = st.executeUpdate("CREATE TABLE PERSON(NAME VARCHAR2(15), AGE VARCHAR2(3), TEL VARCHAR2(20))");
			System.out.println("���̺� ����: " + resSt1);
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
			// �Ű� ���� SQL��, ������ �Է�
			ps = conn.prepareStatement("INSERT INTO PERSON VALUES(?, ?, ?)");
			ps.setString(1, data[0].toString());
			ps.setString(2, data[1].toString());
			ps.setString(3, data[2].toString());
			int insert = ps.executeUpdate();
			System.out.println("insert: " + insert);

			// ���� Model�� data �߰�
			model.addRow(data);

		} catch (Exception ee) {
			System.out.println(ee);
		}
	}

	// CLOSE �޼ҵ�, X��ư Ŭ���� ȣ��
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
			System.out.println("close����>>>>>" + closeException);
		}
	}

	// Event ó�� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		// e.getSource() �� �̺�Ʈ �߻� ������Ʈ�� ����
		if (e.getSource() == tf1) { // �̸�
			// tf2�� Ŀ�� �̵�
			tf2.requestFocus();
		} else if (e.getSource() == tf2) { // ����
			tf3.requestFocus();
		} else if (e.getSource() == tf3) { // ��ȭ ��ȣ
			// �ؽ�Ʈ �ʵ忡 �ƹ��͵� �ۼ����� ���� ��쿡 �˸�â�� ���
			if (tf1.getText().equals("") && tf2.getText().equals("") && tf3.getText().equals("")) {
				// ����) JOptionPane.showMessageDialog(�θ�ü��, ���޼���)
				JOptionPane.showMessageDialog(this, "�ؽ�Ʈ �ʵ带 �Է��� �ּ���.");
				tf1.requestFocus();
				return;
			}

			// �Է� ���� ���� �迭�� ���� �� Table�� row�� �迭 �����̱� ������
			Object data[] = { tf1.getText(), tf2.getText(), tf3.getText() };

			// �ؽ�Ʈ �ʵ� �ʱ�ȭ
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");

			tf1.requestFocus();

			// ������ �Է�
			insert(data);

		}
	}

	public static void main(String[] args) {

		new DB_Person();

	}

}
