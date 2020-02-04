package j200204;

// 추상 클래스 선언
abstract class Abs {

	// 추상 메소드
	abstract public void absPrint();

	// 일반 메소드
	public void print() {
		System.out.println("추상 클래스 일반 메소드 호출");
	}
}

// 외부 클래스
public class OuterInner {

	// 추상 클래스 상속 내부 익명 클래스 객체 생성
	// 추상 클래스를 상속했기 때문에 자료형은 추상 클래스를 따름
	Abs abs = new Abs() {
		public void absPrint() {
			System.out.println("추상 클래스 상속 내부 익명 클래스");
		}
	};

	// 인터페이스 구현 내부 익명 클래스 객체 생성
	// 인터페이스를 구현했기 때문에 자료형은 인터페이스를 따름
	OuterInter oi = new OuterInter() {
		public void interPrint() {
			System.out.println("인터페이스 구현 내부 익명 클래스 ");
		}
	};

	public static void main(String[] args) {

		// 외부 클래스 객체 생성
		OuterInner outin = new OuterInner();

		// 외부 클래스 객체에서 인터페이스 객체의 재정의된 interPrint() 메소드 호출
		outin.oi.interPrint();

		// 추상 클래스 객체의 재정의된 absPrint() 메소드 호출
		outin.abs.absPrint();

		// 추상 클래스 객체의 일반 메소드 역시 사용할 수 있음
		outin.abs.print();
	}

}
