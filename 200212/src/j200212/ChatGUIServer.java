package j200212;

// 입출력
import java.io.*;
// 서버 역할: 클라이언트의 요청을 처리
//	ServerSocket, Socket
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Vector; // 동적 배열: 접속한 클라이언트의 정보를 실시간으로 저장하는 목적(고정 배열X)

public class ChatGUIServer {

	// 클라이언트와 연결할 때만 필요한 ServerSocket 클래스
	ServerSocket ss;

	// 클라이언트와의 통신(문자열 전송)을 위한 Socket 클래스
	Socket s;

	// 접속 클라이언트 정보 실시간 저장
	Vector v;

	// ServerThread 자료형 멤버 변수 선언, has-a 관계 설정을 위함
	ServerThread st;

	// 생성자, 멤버 변수 초기화
	public ChatGUIServer() throws Exception {
		// ======== Properties ========
		Properties props = new Properties();
		FileInputStream in = new FileInputStream(
				"C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\port.properties");

		// port 번호 저장 변수
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

		// 사용자 정보를 담을 v를 Vector 객체로 초기화
		v = new Vector();

		// 접속이 될 수도 있고 안 될 수도 있기 때문에 예외 처리
		try {
			// ServerSocket 객체 생성 → 포트 번호 생성(임의의 번호 부여)
			ss = new ServerSocket(port);
			System.out.println("ss>>>" + ss);
			System.out.println("채팅 서버 가동중...");

			// 서버 가동: 클라이언트가 접속할 때까지 기다리는 것(무한 대기)
			while (true) {
				// 접속 클라이언트 정보를 s에 저장
				s = ss.accept();
				System.out.println("Accepted from" + s);

				// 접속 클라이언트와 서버로 st객체 생성
				st = new ServerThread(this, s);

				// 접속할 때마다 v에 접속 클라이언트 스레드 추가
				this.addThread(st);

				// Thread 가동
				st.start();// -> run() -> broadCast() -> send() 실시간 메소드 호출
			}

		} catch (Exception e) {
			// 접속 실패시 간단한 Error 메세지 출력
			System.out.println("서버 접속 실패>>>" + e);
		}
	}

	// 벡터 v에 접속 클라이언트 정보 저장
	public void addThread(ServerThread st) {
		v.add(st);
	}

	// 퇴장한 클라이언트 정보 제거
	public void removeThread(ServerThread st) {
		v.remove(st);
	}

	// 각 클라이언트에게 실시간으로 메세지를 전송하는 메소드
	public void broadCast(String str) {
		for (int i = 0; i < v.size(); i++) {
			// 클라이언트마다 ServerThread 할당
			ServerThread st = (ServerThread) v.elementAt(i);

			// 각 스레드에 str 문자열을 전송
			st.send(str);
		}
	}

	public static void main(String[] args) throws Exception {

		// 익명 객체 생성
		new ChatGUIServer();

	}

}

// ServerThread 클래스 생성 → 실시간 데이터 전송을 위한 서버 스레드
class ServerThread extends Thread {

	// 클라이언트-서버 통신을 위함
	Socket s;

	// ChatGUIServer 클래스의 객체를 멤버 변수로 선언, has-a 관계를 위함
	ChatGUIServer cg;

	// 입출력
	BufferedReader br;
	PrintWriter pw;

	// 전달할 문자열
	String str;

	// 대화명(ID)
	String name;

	// 생성자
	public ServerThread(ChatGUIServer cg, Socket s) {
		// cg = new CharGUIServer(); → 작성 불가, 서버가 두 번 가동되기 때문에 충돌이 일어남
		// 따라서 매개변수를 이용해서 객체를 얻어온(call by reference) 뒤에 cg와 s값을 초기화해야 함
		this.cg = cg;

		// 접속한 클라이언트 정보 저장
		this.s = s;

		// 데이터 전송을 위한 입출력 스트림 생성
		try {
			// 입력
			// s.getInputStream() => 접속 클라이언트(소켓 객체)의 InputStream을 얻어 옴
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 출력
			// BufferedWriter의 경우 버퍼링 기능을 가지기 때문에 PrintWriter 스트림 사용
			// PrintWriter 스트림의 경우 생성자의 두 번째 인자로 autoFlush 기능을 지정할 수 있음
			// BufferedWriter를 사용하는 경우 flush() 메소드를 사용해야 함
			pw = new PrintWriter(s.getOutputStream(), true);
		} catch (Exception e) {
			System.out.println("에러 발생>>>>>" + e);
		}
	}

	// 데이터(입력 문자열)를 각각의 클라이언트에 전송하는 메소드
	public void send(String str) {
		// 문자열 출력
		pw.println(str);

		// 혹시나 버퍼에 남아있는 것을 비워냄
		pw.flush();
	}

	// 스레드 실행 메소드 -> broadCast(str) -> send(str)
	public void run() {
		try {
			// 대화명 입력 받기
			pw.println("대화명을 입력하세요");
			name = br.readLine();

			// 상대방 클라이언트(cg)에 대화명 출력
			cg.broadCast("[" + name + "]" + "님이 입장했습니다.");

			// 무한 대기하며 입력한 문자열을 계속 전달함
			while ((str = br.readLine()) != null) {
				cg.broadCast("[" + name + "]: " + str);
			}
		} catch (Exception e) {
			// 접속자 퇴장시 다른 사람들에게 실시간 전송
			cg.removeThread(this); // this: ServerThread의 객체 st, 접속 클라이언트
			cg.broadCast("[" + name + "]" + "님이 퇴장했습니다.");

			// 상대방 IP 주소 출력
			System.out.println(s.getInetAddress() + "의 연결이 종료됨!");
		}
	}

}