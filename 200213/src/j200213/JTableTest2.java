package j200213;

import java.awt.*;
// �̺�Ʈ ó�� ��Ű��, ActionEvent -> ActionListener 
import java.awt.event.*;
import javax.swing.*;

// DefaultTableModel Ŭ���� ����� ����
// Model�� �ϳ��� ��ü�� �����ϴ� Ŭ����
import javax.swing.table.*;

public class JTableTest2 extends JFrame implements ActionListener {

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
	public JTableTest2() {
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

		// X��ư Ŭ���� ���� ����ǵ��� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ȭ�鿡 ���
		this.setBounds(1250, 250, 400, 600);
		this.setVisible(true);

		// TextField�� �̺�Ʈ(enter) ����, JTableTest2 ��ü���� ó��(actionPerformed �޼ҵ�)
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
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

			// Model�� ������ �Է�
			// ����) Model ��ü��.addRow(������ �� => �迭 ��)
			model.addRow(data);

			// �ؽ�Ʈ �ʵ� �ʱ�ȭ
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
