package j200213;

import java.awt.*;
import javax.swing.*;

// MVC ��
// Model: ������ ���� ����(�迭�� ����)
// View: ȭ�鿡 ����ϴ� ����, JTable, JScrollPane ��
// Controller: Model ������ �����͸� View�� ����ϴ� ����� ����

public class JTableTest extends JFrame {

	// ���� ������Ʈ
	JTable table;

	public JTableTest() {
		setTitle("JTable ���� ����");
		// ====== Model =======
		String header[] = { "�̸�", "�ּ�", "��ȭ��ȣ" };
		String cells[][] = { { "ȫ�浿", "����", "02-123-1241" }, { "�̼���", "�泲", "010-2532-1231" },
				{ "������", "�Ѿ�", "010-2313-1236" } };

		// JTable(Object[][] rowData, Object[] columnNames)
		table = new JTable(cells, header);
		JScrollPane jp = new JScrollPane(table);
		add(jp);	// add() �տ� this.getContentPane() ����
		// =================

		setBounds(300, 300, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableTest();
	}

}
