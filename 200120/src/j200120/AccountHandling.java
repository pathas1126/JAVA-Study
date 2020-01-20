package j200120;

class Account {

	// 1. 멤버 변수 선언
	String name; // 계좌 명의
	String accountNo; // 계좌번호: 계산하지 않기 때문에 문자열로 저장
	long balance = 1000; // 예금 잔액

	// 2. 멤버 메소드 정의
	// 잔액 조회 메서드: 단순, 반복, 매개변수 X, 반환값 X
	void searchPrint() {
		System.out.println(name + "님의 잔액은 " + balance + "입니다.");
	}

	// 무통장 입금 메서드 : 매개변수 O, 반환값 X
	void deposit(long input) {
		balance += input;
		System.out.println(input + "만큼 입금이 완료되었습니다. (잔액): " + balance);
	}

	// 출금 메서드 : 매개변수 O, 반환값 X
	void withdraw(long output) {
		balance -= output;
		System.out.println(output + "만큼 출금이 완료되었습니다. (잔액): " + balance);
	}
}

public class AccountHandling {

	public static void main(String[] args) {
		// 하나의 클래스로 여러 개의 객체 생성

		// 철수 계좌 생성
		Account cheolsoo = new Account(); // cheolsoo 객체 생성
		cheolsoo.name = "철수";
		cheolsoo.accountNo = "1234-542-11612";

		// 영희 계좌 생성
		Account younghee = new Account(); // younghee 객체 생성
		younghee.name = "영희";
		younghee.accountNo = "5342-112-23521";
		
		// 철수 계좌에 5000원 입금
		cheolsoo.deposit(5000);	// deposit메서드를 호출하면서 5000값 전달
		
		// 철수 계좌에서 4000원 출금
		cheolsoo.withdraw(4000);
		
		// 철수 계좌의 잔액 조회
		cheolsoo.searchPrint();
	}

}
