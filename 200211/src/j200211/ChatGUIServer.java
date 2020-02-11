package j200211;

// ���� ����: Ŭ���̾�Ʈ�� ��û�� ó��
import java.net.*; //	ServerSocket, Socket
import java.io.*; // �����
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
	public ChatGUIServer() {
		// ����� ������ ���� v�� Vector ��ü�� �ʱ�ȭ
		v = new Vector();

		// ������ �� ���� �ְ� �� �� ���� �ֱ� ������ ���� ó��
		try {
			// ServerSocket ��ü ���� �� ��Ʈ ��ȣ ����(������ ��ȣ �ο�)
			ss = new ServerSocket(5432);
			System.out.println("ss>>>" + ss);
			System.out.println("ä�� ���� ������...");

			// ���� ����: Ŭ���̾�Ʈ�� ������ ������ ��ٸ��� ��(���� ���)
			while (true) {
				// ���� Ŭ���̾�Ʈ ������ s�� ����
				s = ss.accept();
				System.out.println("Accepted from" + s);

				// ���� ���� ���Ŀ� st ���� �ʱ�ȭ
				st = new ServerThread(this, s);
				
				// ������ ������ v�� ���� Ŭ���̾�Ʈ ���� �߰�
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

	}

	public static void main(String[] args) {

		// �͸� ��ü ����
		new ChatGUIServer();

	}

}

// ServerThread Ŭ���� ���� �� �ǽð� ������ ������ ���ؼ� ������ �ʿ�
class ServerThread extends Thread {

	// Ŭ���̾�Ʈ���� ����� ����
	Socket s;

	// ���� Ŭ������ ��ü�� ��� ������ ����, has-a ���踦 ����
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
		// cg = new CharGUIServer(); �� �ۼ� �Ұ�, ������ �� �� �����Ǳ� ������ �浹�� �Ͼ
		// ���� �Ű������� �̿��ؼ� ��ü�� ���� �ڿ� cg�� s���� �ʱ�ȭ�ؾ� ��
		this.cg = cg;
		this.s = s;
	}

	// �����͸� Ŭ���̾�Ʈ�� �����ϴ� �޼ҵ�
	public void send(String str) {

	}

	// ������ ���� �޼ҵ�
	public void run() {

	}

}
