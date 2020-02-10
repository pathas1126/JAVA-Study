import java.lang.Thread;

public class MultiThread extends Thread {

	// 생성자
	public MultiThread(String s) {
		// 부모 생성자 호출
		super(s);
	}

	// Thread 클래스를 상속받아서 run() 구현
	public void run() { // 실시간으로 데이터 출력, 저장, 계산 etc.
		// a ~ z까지 출력하는 반복문
		for (char i = 'a'; i <= 'z'; i++) {
			// sleep() 메소드를 사용하기 위해 try~catch문으로 예외 처리
			try {
				// 스레드가 작업마다 2초씩 중지하도록 함
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			System.out.println("현재 실행중인 스레드: " + this.getName());
		}
	}

	public static void main(String[] args) {
		// MultiThread 스레드 객체 생성, 스레드 이름을 TEST로 설정
		MultiThread mt = new MultiThread("TEST");

		// 스레드 객체 실행
		mt.start();

	}

}
