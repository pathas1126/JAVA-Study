package j200204;

import java.awt.*;
import javax.swing.*;

public class BorderTest extends JFrame {
	// ��ư ������Ʈ ����
	JButton b1 = new JButton("��ư1");
	JButton b2 = new JButton("��ư2");
	JButton b3 = new JButton("��ư3");
	JButton b4 = new JButton("��ư4");
	JButton b5 = new JButton("��ư5");

	BorderTest() {
		super("�����ε���?;");
		setDefault();
	}

	BorderTest(String s) {
		super(s);
		setDefault();
	}

	public void setDefault() {
		setBounds(600, 300, 600, 200);
		getContentPane().setBackground(new Color(12, 154, 104));
		// BorderLayout
//		getContentPane().add(b1, BorderLayout.WEST);
//		add(b2, "North");
//		add(b3, "East");
//		add(b4, "South");
//		add(b5, "Center");
		// FlowLayout
//		FlowLayout fl = new FlowLayout();
//		getContentPane().setLayout(fl);
//		add(b1);
//		add(b2);
//		add(b3);
//		add(b4);
//		add(b5);
		getContentPane().setLayout(new GridLayout(3, 2, 100, 10));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/*
	 * public void addButton() { this.getContentPane().add(new Button()); }
	 * 
	 * public void addButton(String s) { this.getContentPane().add(new Button(s)); }
	 */
	public static void main(String[] args) {
		// �͸� ��ü
		new BorderTest();
	}

}
