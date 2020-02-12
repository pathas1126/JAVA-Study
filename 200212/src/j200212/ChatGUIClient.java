package j200212;

// Socket Ŭ����
import java.net.*;
import java.util.Properties;
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
	Socket s; // �������� ����� ����

	// ======== Stream =======
	BufferedReader br; // Ŭ���̾�Ʈ������ ���ڿ� �Է� ��Ʈ��
	PrintWriter pw; // ���ڿ� ��� ��Ʈ��

	// ������ ������ ���ڿ��� �������� �޾ƿ� ���ڿ� ����
	String str, str1;

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

			// ======== Properties ========
			Properties props = new Properties();
			FileInputStream in = new FileInputStream(
					"C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\port.properties");

			// port ��ȣ ���� ����
			String ip = "";

			if (in != null && in.available() > 0) {
				props.load(in);
				ip = props.getProperty("ip"); // "1"
			}

			// Ŭ���̾�Ʈ �� ���� ���� �ʱ�ȭ
			// Socket(host, port), host: ���� ���� IP �ּ�, port: ���� ��Ʈ
			s = new Socket(ip, 5432);
			System.out.println("s>>>" + s);

			// ========== Server�� Stream ���� ===========
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			System.out.println("���� ����>>>" + e);
		}
		// Thread ��ü ���� -> run() ȣ��
		Thread ct = new Thread(this); // Runnable �������̽��� �����ϱ� ������ this �ۼ�
		ct.start();
	}

	// Runnable �޼ҵ� �������̵�
	public void run() {
		// �� �̻� �Է��� ���� �� ���� ������ JTextArea(ä��â)�� ���
		try {
			while ((str1 = br.readLine()) != null) {
				ta.append(str1 + "\n"); // ������ ���� ���ڸ� ä��â�� ���η� ���
			}
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}

	// ActionListener �޼ҵ� �������̵�, �Է¶����� enter�Է½� �߻��� �̺�Ʈ
	public void actionPerformed(ActionEvent e) {
		// ���� �� �޼����� str ������ ����
		str = tf.getText();

		// ������ ���� �� �ؽ�Ʈ�ʵ� �ʱ�ȭ
		tf.setText("");

		// ���� �� �޼��� ��� -> ������ br.readLine()���� �о����
		pw.println(str);
		pw.flush();
	}

	public static void main(String[] args) {

		new ChatGUIClient();

	}

}