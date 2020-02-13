package j200213;

// Thread를 이용해서 작성

public class LamTest3 extends Thread {

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				// 현재 시간을 밀리초 단위로 출력
				System.out.println("출력: " + System.currentTimeMillis());
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static void main(String[] args) {
		LamTest3 lt = new LamTest3();
//		lt.start();

		Runnable rb = () -> {
			while (true) {
				try {
					Thread.sleep(1000);
					System.out.println("현재 시간: " + System.currentTimeMillis());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		rb.run();

	}

}
