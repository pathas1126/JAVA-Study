package j200204;

import java.awt.*;
import javax.swing.*;

public class BorderTest extends JFrame {
	// 버튼 컴포넌트 선언
	JButton b1 = new JButton("버튼1");
	JButton b2 = new JButton("버튼2");
	JButton b3 = new JButton("버튼3");
	JButton b4 = new JButton("버튼4");
	JButton b5 = new JButton("버튼5");

	BorderTest() {
		super("제목인데요?;");
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
		// 익명 객체
		new BorderTest();
	}

}
