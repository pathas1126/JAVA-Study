import java.lang.Thread;

public class MultiThread extends Thread {

	// ������
	public MultiThread(String s) {
		// �θ� ������ ȣ��
		super(s);
	}

	// Thread Ŭ������ ��ӹ޾Ƽ� run() ����
	public void run() { // �ǽð����� ������ ���, ����, ��� etc.
		// a ~ z���� ����ϴ� �ݺ���
		for (char i = 'a'; i <= 'z'; i++) {
			// sleep() �޼ҵ带 ����ϱ� ���� try~catch������ ���� ó��
			try {
				// �����尡 �۾����� 2�ʾ� �����ϵ��� ��
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			System.out.println("���� �������� ������: " + this.getName());
		}
	}

	public static void main(String[] args) {
		// MultiThread ������ ��ü ����, ������ �̸��� TEST�� ����
		MultiThread mt = new MultiThread("TEST");

		// ������ ��ü ����
		mt.start();

	}

}
