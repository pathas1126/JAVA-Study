package j200204;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// ��ư Ŭ��, ActionEvent -> ActionListener, actionPerformed(), �ؽ�Ʈ�ʵ�
public class ButtonEvent extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	JTextField tf1;

	// ������Ʈ ���� ���(Frame -> Panel -> Button) �� ������Ʈ ���� ���(Button -> Panel -> Frame)

	public ButtonEvent() {
		super("��ư�� �̿��� �̺�Ʈó���� ��ü����ȯ");
		setBounds(600, 200, 400, 300);
		getContentPane().setLayout(new GridLayout(5, 1, 3, 3));
		// JPanel p = new JPanel();
		// â�� ������ ������Ʈ ����
		b1 = new JButton("����");
		b2 = new JButton("Go");
		b3 = new JButton("Back");
		b4 = new JButton("����");
		tf1 = new JTextField("");
		// p.add(comp) ��ư ����
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(tf1);
		// ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		tf1.addActionListener(this);

		setVisible(true);
	}

	@Override
	// ��ư�� Ŭ������ �� �ڵ����� ȣ��Ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		// ActionEvent: �̺�Ʈ �߻� ������Ʈ ������ ���� �ִ� �޼ҵ�
		// 1. e.getActionCommand() �̺�Ʈ �߻� ������Ʈ�� �̸��� ������
		// 2. e.getSource() �̺�Ʈ �߻� ������Ʈ ������ ������
		System.out.println(e.getActionCommand());
		String s = e.getActionCommand();
		// ���� ��ư�� �����ٸ�
		if (s.contentEquals("����")) {
			// getContentPane()�� JFrame�� ���� �ο��� ���� ���
			b1.setBackground(new Color(200, 20, 40));
			System.out.println(b1.getBackground());
			this.setTitle(s);
		} else if (s.contentEquals("Go")) {
			b2.setBackground(new Color(100, 80, 60));
			this.setTitle(s);
		} else if (s.contentEquals("Back")) {
			b3.setBackground(new Color(50, 60, 200));
			this.setTitle(s);
		} else if (s.contentEquals("����")) {
			b4.setBackground(new Color(50, 200, 60));
			this.setTitle(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEvent();
	}

}
