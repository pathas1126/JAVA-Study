package j200212;

// �����
import java.io.*;
// ���� ����: Ŭ���̾�Ʈ�� ��û�� ó��
//	ServerSocket, Socket
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Vector; // ���� �迭: ������ Ŭ���̾�Ʈ�� ������ �ǽð����� �����ϴ� ����(���� �迭X)

public class ChatGUIServer {

	// Ŭ���̾�Ʈ�� ������ ���� �ʿ��� ServerSocket Ŭ����
	ServerSocket ss;

	// Ŭ���̾�Ʈ���� ���(���ڿ� ����)�� ���� Socket Ŭ����
	Socket s;

	// ���� Ŭ���̾�Ʈ ���� �ǽð� ����
	Vector v;

	// ServerThread �ڷ��� ��� ���� ����, has-a ���� ������ ����
	ServerThread st;

	// ������, ��� ���� �ʱ�ȭ
	public ChatGUIServer() throws Exception {
		// ======== Properties ========
		Properties props = new Properties();
		FileInputStream in = new FileInputStream(
				"C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\port.properties");

		// port ��ȣ ���� ����
		String service = "";

		if (in != null && in.available() > 0) {
			props.load(in);
			service = props.getProperty("port"); // "1"
		}
		if ("".contentEquals(service)) {
			service = "5432";
		}
		int port = Integer.parseInt(service);
		switch (port) {
		case 1:
			port = 5432;
			break;
		case 2:
			port = 5000;
			break;
		case 3:
			port = 7777;
			break;
		default:
			port = 3000;
			break;
		}

		System.out.println(port);

		// ����� ������ ���� v�� Vector ��ü�� �ʱ�ȭ
		v = new Vector();

		// ������ �� ���� �ְ� �� �� ���� �ֱ� ������ ���� ó��
		try {
			// ServerSocket ��ü ���� �� ��Ʈ ��ȣ ����(������ ��ȣ �ο�)
			ss = new ServerSocket(port);
			System.out.println("ss>>>" + ss);
			System.out.println("ä�� ���� ������...");

			// ���� ����: Ŭ���̾�Ʈ�� ������ ������ ��ٸ��� ��(���� ���)
			while (true) {
				// ���� Ŭ���̾�Ʈ ������ s�� ����
				s = ss.accept();
				System.out.println("Accepted from" + s);

				// ���� Ŭ���̾�Ʈ�� ������ st��ü ����
				st = new ServerThread(this, s);

				// ������ ������ v�� ���� Ŭ���̾�Ʈ ������ �߰�
				this.addThread(st);

				// Thread ����
				st.start();// -> run() -> broadCast() -> send() �ǽð� �޼ҵ� ȣ��
			}

		} catch (Exception e) {
			// ���� ���н� ������ Error �޼��� ���
			System.out.println("���� ���� ����>>>" + e);
		}
	}

	// ���� v�� ���� Ŭ���̾�Ʈ ���� ����
	public void addThread(ServerThread st) {
		v.add(st);
	}

	// ������ Ŭ���̾�Ʈ ���� ����
	public void removeThread(ServerThread st) {
		v.remove(st);
	}

	// �� Ŭ���̾�Ʈ���� �ǽð����� �޼����� �����ϴ� �޼ҵ�
	public void broadCast(String str) {
		for (int i = 0; i < v.size(); i++) {
			// Ŭ���̾�Ʈ���� ServerThread �Ҵ�
			ServerThread st = (ServerThread) v.elementAt(i);

			// �� �����忡 str ���ڿ��� ����
			st.send(str);
		}
	}

	public static void main(String[] args) throws Exception {

		// �͸� ��ü ����
		new ChatGUIServer();

	}

}

// ServerThread Ŭ���� ���� �� �ǽð� ������ ������ ���� ���� ������
class ServerThread extends Thread {

	// Ŭ���̾�Ʈ-���� ����� ����
	Socket s;

	// ChatGUIServer Ŭ������ ��ü�� ��� ������ ����, has-a ���踦 ����
	ChatGUIServer cg;

	// �����
	BufferedReader br;
	PrintWriter pw;

	// ������ ���ڿ�
	String str;

	// ��ȭ��(ID)
	String name;

	// ������
	public ServerThread(ChatGUIServer cg, Socket s) {
		// cg = new CharGUIServer(); �� �ۼ� �Ұ�, ������ �� �� �����Ǳ� ������ �浹�� �Ͼ
		// ���� �Ű������� �̿��ؼ� ��ü�� ����(call by reference) �ڿ� cg�� s���� �ʱ�ȭ�ؾ� ��
		this.cg = cg;

		// ������ Ŭ���̾�Ʈ ���� ����
		this.s = s;

		// ������ ������ ���� ����� ��Ʈ�� ����
		try {
			// �Է�
			// s.getInputStream() => ���� Ŭ���̾�Ʈ(���� ��ü)�� InputStream�� ��� ��
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// ���
			// BufferedWriter�� ��� ���۸� ����� ������ ������ PrintWriter ��Ʈ�� ���
			// PrintWriter ��Ʈ���� ��� �������� �� ��° ���ڷ� autoFlush ����� ������ �� ����
			// BufferedWriter�� ����ϴ� ��� flush() �޼ҵ带 ����ؾ� ��
			pw = new PrintWriter(s.getOutputStream(), true);
		} catch (Exception e) {
			System.out.println("���� �߻�>>>>>" + e);
		}
	}

	// ������(�Է� ���ڿ�)�� ������ Ŭ���̾�Ʈ�� �����ϴ� �޼ҵ�
	public void send(String str) {
		// ���ڿ� ���
		pw.println(str);

		// Ȥ�ó� ���ۿ� �����ִ� ���� �����
		pw.flush();
	}

	// ������ ���� �޼ҵ� -> broadCast(str) -> send(str)
	public void run() {
		try {
			// ��ȭ�� �Է� �ޱ�
			pw.println("��ȭ���� �Է��ϼ���");
			name = br.readLine();

			// ���� Ŭ���̾�Ʈ(cg)�� ��ȭ�� ���
			cg.broadCast("[" + name + "]" + "���� �����߽��ϴ�.");

			// ���� ����ϸ� �Է��� ���ڿ��� ��� ������
			while ((str = br.readLine()) != null) {
				cg.broadCast("[" + name + "]: " + str);
			}
		} catch (Exception e) {
			// ������ ����� �ٸ� ����鿡�� �ǽð� ����
			cg.removeThread(this); // this: ServerThread�� ��ü st, ���� Ŭ���̾�Ʈ
			cg.broadCast("[" + name + "]" + "���� �����߽��ϴ�.");

			// ���� IP �ּ� ���
			System.out.println(s.getInetAddress() + "�� ������ �����!");
		}
	}

}