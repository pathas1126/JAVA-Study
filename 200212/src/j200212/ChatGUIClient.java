package j200212;

// Socket 클래스
import java.net.*;
import java.util.Properties;
// 입출력 클래스
import java.io.*;

// 그래픽 관련 클래스
import java.awt.*; // GUI
import javax.swing.*; // JFrame, JTextField, JTextArea, JScrollPane

// Event 처리
import java.awt.event.*; // ActionListener

public class ChatGUIClient extends JFrame implements ActionListener, Runnable {

	// ======== GUI =========
	JTextField tf; // 전송할 텍스트 입력창
	JTextArea ta; // 전송받은 텍스트 출력

	JScrollPane js; // 스크롤바 생성

	// ======== Socket =======
	Socket s; // 서버와의 통신을 위함

	// ======== Stream =======
	BufferedReader br; // 클라이언트에서의 문자열 입력 스트림
	PrintWriter pw; // 문자열 출력 스트림

	// 서버로 전송할 문자열과 서버에서 받아올 문자열 변수
	String str, str1;

	// ======== 생성자 ========
	public ChatGUIClient() {
		// 창, 부착할 컴포넌트 생성 및 연결
		tf = new JTextField();
		ta = new JTextArea();

		// 텍스트 출력창에 스크롤 바 연결
		js = new JScrollPane(ta);
		// BorderLayout 배치관리자, JTextArea를 정중앙에 부착
		add(js, "Center");

		// 텍스트 필드를 하단에 부착
		add(tf, BorderLayout.SOUTH);

		// 텍스트 필드에서 이벤트 입력, 해당 객체에서 이벤트 처리
		tf.addActionListener(this);

		// 창의 크기 지정
		setBounds(200, 200, 500, 350);

		// 창이 보이도록 설정
		setVisible(true);

		// 텍스트 필드에 커서 입력
		tf.requestFocus();

		// 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 서버와 연결, 연결되지 않을 수도 있기 때문에 예외 처리 필수
		try {

			// ======== Properties ========
			Properties props = new Properties();
			FileInputStream in = new FileInputStream(
					"C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\port.properties");

			// port 번호 저장 변수
			String ip = "";

			if (in != null && in.available() > 0) {
				props.load(in);
				ip = props.getProperty("ip"); // "1"
			}

			// 클라이언트 측 소켓 정보 초기화
			// Socket(host, port), host: 접속 서버 IP 주소, port: 서버 포트
			s = new Socket(ip, 5432);
			System.out.println("s>>>" + s);

			// ========== Server와 Stream 연결 ===========
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			System.out.println("접속 오류>>>" + e);
		}
		// Thread 객체 생성 -> run() 호출
		Thread ct = new Thread(this); // Runnable 인터페이스를 구현하기 때문에 this 작성
		ct.start();
	}

	// Runnable 메소드 오버라이딩
	public void run() {
		// 더 이상 입력을 받을 수 없을 때까지 JTextArea(채팅창)에 출력
		try {
			while ((str1 = br.readLine()) != null) {
				ta.append(str1 + "\n"); // 상대방이 보낸 문자를 채팅창에 세로로 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}

	// ActionListener 메소드 오버라이딩, 입력란에서 enter입력시 발생할 이벤트
	public void actionPerformed(ActionEvent e) {
		// 내가 쓴 메세지를 str 변수에 저장
		str = tf.getText();

		// 변수에 저장 후 텍스트필드 초기화
		tf.setText("");

		// 내가 쓴 메세지 출력 -> 상대방은 br.readLine()으로 읽어들임
		pw.println(str);
		pw.flush();
	}

	public static void main(String[] args) {

		new ChatGUIClient();

	}

}