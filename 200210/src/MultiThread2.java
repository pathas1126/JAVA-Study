import java.io.*;
import java.lang.Thread;

// 첫 번째 스레드
class PrintThread extends Thread {

	public void run() {
		// sleep() 사용을 위한 예외 처리
		try {
			// 1부터 9까지의 수 출력
			for (int i = 1; i < 10; i++) {

				/*
				 * 스레드를 1~1000 밀리초만큼 무작위로 중지시킴, Math.random(): 0 ~ 0.999999... 사이의 난수 반환
				 */
				long sleepTime = (long) Math.ceil(Math.random() * 1000);
				System.out.println(sleepTime);

				// 임의의 시간만큼 스레드를 중지시킴
				this.sleep(sleepTime);
				System.out.println("i: " + i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// 두 번째 스레드, 구구단 출력
class GuguThread implements Runnable {

	// 단을 입력 받을 멤버 변수
	int dan;

	// 생성자
	public GuguThread(int dan) {
		this.dan = dan;
	}

	// 99단 출력 run() 메소드
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "= " + (dan * i));
			// 단을 하나씩 출력할 때마다 500밀리초씩 스레드를 중지시킴
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class MultiThread2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자를 입력하세요");
		int dan = Integer.parseInt(br.readLine());
		
		// Runnable 구현 클래스 객체 생성
		GuguThread gu = new GuguThread(dan);

		// gu 스레드 객체를 이용해서 Thread 객체 생성
		Thread gugu = new Thread(gu, "GUGU");

		// Thread 상속 클래스 객체 생성
		PrintThread pt = new PrintThread();

		// 스레드별 우선 순위 설정
		gugu.setPriority(1);
		pt.setPriority(Thread.MAX_PRIORITY);

		// 스레드 실행
		gugu.start(); pt.start();
	}

}
