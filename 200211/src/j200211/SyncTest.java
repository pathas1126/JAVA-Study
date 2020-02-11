package j200211;

class ATM implements Runnable {

	// �޿����� �ܾ�
	private long money = 10000;

	public void run() {
		// ����ȭ �� ATM ��ü�� ������ �����尡 ������ �� ���� ��ٸ����� ��
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					// �����尡 1�ʰ� ����ϵ��� ��
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
				// �ܾ��� 0���� �۾����� �ݺ������� Ż��
				if (check() <= 0)
					break;
				// ���
				withdraw(1000);
			}
		}
	}

	// ���� �޼ҵ�
	public void withdraw(long money) {
		// check() - money > 0 �� ��쿡 ���
		if (check() > money) {
			this.money -= money;
			// ���� Thread �� �ܾ� ���
			System.out.println(Thread.currentThread().getName() + ", " + check());
		} else {
			System.out.println("�ܾ��� �����մϴ�!");
		}
	}

	// �ܾ� ��ȸ
	public long check() {
		return money;
	}

}

public class SyncTest {

	public static void main(String[] args) {
		// ��ü�� �ϳ��� �����ؾ� ���� �����忡�� �ϳ��� �����͸� ������ �� ����
		ATM atm = new ATM();

		// Thread ���� �� ����
		Thread atm1 = new Thread(atm, "�����");
		Thread atm2 = new Thread(atm, "������");
		atm1.start();
		atm2.start();
	}

}
