package j200211;

// 서버 역할: 클라이언트의 요청을 처리
import java.net.*; //	ServerSocket, Socket
import java.io.*; // 입출력
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
	public ChatGUIServer() {
		// 사용자 정보를 담을 v를 Vector 객체로 초기화
		v = new Vector();

		// 접속이 될 수도 있고 안 될 수도 있기 때문에 예외 처리
		try {
			// ServerSocket 객체 생성 → 포트 번호 생성(임의의 번호 부여)
			ss = new ServerSocket(5432);
			System.out.println("ss>>>" + ss);
			System.out.println("채팅 서버 가동중...");

			// 서버 가동: 클라이언트가 접속할 때까지 기다리는 것(무한 대기)
			while (true) {
				// 접속 클라이언트 정보를 s에 저장
				s = ss.accept();
				System.out.println("Accepted from" + s);

				// 소켓 연결 이후에 st 변수 초기화
				st = new ServerThread(this, s);
				
				// 접속할 때마다 v에 접속 클라이언트 정보 추가
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

	}

	public static void main(String[] args) {

		// 익명 객체 생성
		new ChatGUIServer();

	}

}

// ServerThread 클래스 생성 → 실시간 데이터 전송을 위해서 스레드 필요
class ServerThread extends Thread {

	// 클라이언트와의 통신을 위함
	Socket s;

	// 상대방 클래스의 객체를 멤버 변수로 선언, has-a 관계를 위함
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
		// cg = new CharGUIServer(); → 작성 불가, 서버가 두 번 가동되기 때문에 충돌이 일어날
		// 따라서 매개변수를 이용해서 객체를 얻어온 뒤에 cg와 s값을 초기화해야 함
		this.cg = cg;
		this.s = s;
	}

	// 데이터를 클라이언트에 전송하는 메소드
	public void send(String str) {

	}

	// 스레드 실행 메소드
	public void run() {

	}

}
