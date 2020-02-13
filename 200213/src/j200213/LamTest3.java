package j200213;

// Thread�� �̿��ؼ� �ۼ�

public class LamTest3 extends Thread {

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				// ���� �ð��� �и��� ������ ���
				System.out.println("���: " + System.currentTimeMillis());
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
					System.out.println("���� �ð�: " + System.currentTimeMillis());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		rb.run();

	}

}
