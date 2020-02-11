package j200211;

class ATM implements Runnable {

	// 급여계좌 잔액
	private long money = 10000;

	public void run() {
		// 동기화 → ATM 객체에 복수의 스레드가 접근할 때 서로 기다리도록 함
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					// 스레드가 1초간 대기하도록 함
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
				// 잔액이 0보다 작아지면 반복문에서 탈출
				if (check() <= 0)
					break;
				// 출금
				withdraw(1000);
			}
		}
	}

	// 인출 메소드
	public void withdraw(long money) {
		// check() - money > 0 인 경우에 출금
		if (check() > money) {
			this.money -= money;
			// 현재 Thread 및 잔액 출력
			System.out.println(Thread.currentThread().getName() + ", " + check());
		} else {
			System.out.println("잔액이 부족합니다!");
		}
	}

	// 잔액 조회
	public long check() {
		return money;
	}

}

public class SyncTest {

	public static void main(String[] args) {
		// 객체를 하나만 생성해야 여러 스레드에서 하나의 데이터를 공유할 수 있음
		ATM atm = new ATM();

		// Thread 생성 및 실행
		Thread atm1 = new Thread(atm, "보헙금");
		Thread atm2 = new Thread(atm, "공과금");
		atm1.start();
		atm2.start();
	}

}
