package j200211;

// Socket 클래스
import java.net.*;

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
	Socket s;

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
			// 클라이언트 측 소켓 정보 초기화
			// Socket(host, port), host: 접속 서버 IP 주소, port: 서버 포트
			s = new Socket("192.168.0.117", 5432);
		} catch (Exception e) {
			System.out.println("접속 오류>>>" + e);
		}

	}

	// Runnable 메소드 오버라이딩
	public void run() {

	}

	// ActionListener 메소드 오버라이딩
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {

		new ChatGUIClient();

	}

}
