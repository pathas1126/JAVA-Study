import java.lang.Thread;

public class MyThread implements Runnable {

	// run() 메소드 오버라이딩
	public void run() {
		while (5 > 1) {
			// "is Running!" 출력
			System.out.println("is Running!");
			try {
				// 1초씩 스레드가 정지하도록 함
				Thread.sleep(1000);
				// 현재 실행중인 스레드의 이름 출력
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// Runnable 구현 클래스 객체 생성
		MyThread mt = new MyThread();

		// Runnable 구현 클래스 객체를 이용해서 Thread 클래스 객체 생성, Thread 이름은 "Test"
		Thread tt = new Thread(mt, "Test");

		// tt 객체 실행
		tt.start();	// tt.run() : 기존 main 스레드를 멈추고 새로운 스레드 실행 → 성능이 저하됨

		// Runnable 구현 클래스 객체 실행
		mt.run();

	}

}
