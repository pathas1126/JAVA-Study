import java.lang.Thread;

public class MyThread implements Runnable {

	// run() �޼ҵ� �������̵�
	public void run() {
		while (5 > 1) {
			// "is Running!" ���
			System.out.println("is Running!");
			try {
				// 1�ʾ� �����尡 �����ϵ��� ��
				Thread.sleep(1000);
				// ���� �������� �������� �̸� ���
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// Runnable ���� Ŭ���� ��ü ����
		MyThread mt = new MyThread();

		// Runnable ���� Ŭ���� ��ü�� �̿��ؼ� Thread Ŭ���� ��ü ����, Thread �̸��� "Test"
		Thread tt = new Thread(mt, "Test");

		// tt ��ü ����
		tt.start();	// tt.run() : ���� main �����带 ���߰� ���ο� ������ ���� �� ������ ���ϵ�

		// Runnable ���� Ŭ���� ��ü ����
		mt.run();

	}

}
