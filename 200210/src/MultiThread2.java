import java.io.*;
import java.lang.Thread;

// ù ��° ������
class PrintThread extends Thread {

	public void run() {
		// sleep() ����� ���� ���� ó��
		try {
			// 1���� 9������ �� ���
			for (int i = 1; i < 10; i++) {

				/*
				 * �����带 1~1000 �и��ʸ�ŭ �������� ������Ŵ, Math.random(): 0 ~ 0.999999... ������ ���� ��ȯ
				 */
				long sleepTime = (long) Math.ceil(Math.random() * 1000);
				System.out.println(sleepTime);

				// ������ �ð���ŭ �����带 ������Ŵ
				this.sleep(sleepTime);
				System.out.println("i: " + i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// �� ��° ������, ������ ���
class GuguThread implements Runnable {

	// ���� �Է� ���� ��� ����
	int dan;

	// ������
	public GuguThread(int dan) {
		this.dan = dan;
	}

	// 99�� ��� run() �޼ҵ�
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "= " + (dan * i));
			// ���� �ϳ��� ����� ������ 500�и��ʾ� �����带 ������Ŵ
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
		
		System.out.println("���ڸ� �Է��ϼ���");
		int dan = Integer.parseInt(br.readLine());
		
		// Runnable ���� Ŭ���� ��ü ����
		GuguThread gu = new GuguThread(dan);

		// gu ������ ��ü�� �̿��ؼ� Thread ��ü ����
		Thread gugu = new Thread(gu, "GUGU");

		// Thread ��� Ŭ���� ��ü ����
		PrintThread pt = new PrintThread();

		// �����庰 �켱 ���� ����
		gugu.setPriority(1);
		pt.setPriority(Thread.MAX_PRIORITY);

		// ������ ����
		gugu.start(); pt.start();
	}

}
