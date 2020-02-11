package j200211;

// Socket Ŭ����
import java.net.*;

// ����� Ŭ����
import java.io.*;

// �׷��� ���� Ŭ����
import java.awt.*; // GUI
import javax.swing.*; // JFrame, JTextField, JTextArea, JScrollPane

// Event ó��
import java.awt.event.*; // ActionListener

public class ChatGUIClient extends JFrame implements ActionListener, Runnable {

	// ======== GUI =========
	JTextField tf; // ������ �ؽ�Ʈ �Է�â
	JTextArea ta; // ���۹��� �ؽ�Ʈ ���

	JScrollPane js; // ��ũ�ѹ� ����

	// ======== Socket =======
	Socket s;

	// ======== ������ ========
	public ChatGUIClient() {
		// â, ������ ������Ʈ ���� �� ����
		tf = new JTextField();
		ta = new JTextArea();

		// �ؽ�Ʈ ���â�� ��ũ�� �� ����
		js = new JScrollPane(ta);
		// BorderLayout ��ġ������, JTextArea�� ���߾ӿ� ����
		add(js, "Center");

		// �ؽ�Ʈ �ʵ带 �ϴܿ� ����
		add(tf, BorderLayout.SOUTH);

		// �ؽ�Ʈ �ʵ忡�� �̺�Ʈ �Է�, �ش� ��ü���� �̺�Ʈ ó��
		tf.addActionListener(this);

		// â�� ũ�� ����
		setBounds(200, 200, 500, 350);

		// â�� ���̵��� ����
		setVisible(true);

		// �ؽ�Ʈ �ʵ忡 Ŀ�� �Է�
		tf.requestFocus();

		// ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������ ����, ������� ���� ���� �ֱ� ������ ���� ó�� �ʼ�
		try {
			// Ŭ���̾�Ʈ �� ���� ���� �ʱ�ȭ
			// Socket(host, port), host: ���� ���� IP �ּ�, port: ���� ��Ʈ
			s = new Socket("192.168.0.117", 5432);
		} catch (Exception e) {
			System.out.println("���� ����>>>" + e);
		}

	}

	// Runnable �޼ҵ� �������̵�
	public void run() {

	}

	// ActionListener �޼ҵ� �������̵�
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {

		new ChatGUIClient();

	}

}
