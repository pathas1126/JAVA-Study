package j200204;

public class Outer {
	// 멤버 변수
	int a;

	// 생성자
	public Outer() {
		// 멤버 변수 초기화
		a = 10;
	}

	public void aa() {
		System.out.println("aa 메소드 호출");
		Inner in = new Inner();
		in.cc();
	}

	public void bb() {
		System.out.println("bb 메소드 호출");
	}

	// ========= Inner Class =========
	public class Inner {
		// 내부 클래스 멤버 변수
		int ax;

		// 내부 클래스 생성자
		public Inner() {
			ax = 15;
		}

		// 내부 클래스 메소드
		public void cc() {
			System.out.println("내부 클래스 cc 메소드 호출");
			System.out.println("외부 a: " + a + ", 내부 ax: " + ax);
			bb();
		}
	}

	public static void main(String[] args) {
		// Outer 클래스 객체 생성
		Outer out = new Outer();
		// main()에서 Inner 클래스 접근
		// 형식) Outer클래스명.Inner클래스명 Inner객체명 = Outer객체명.new Inner클래스명();
		Outer.Inner oi = out.new Inner();
		System.out.println("==내부 클래스 멤버 변수==");
		System.out.println("ax: " + oi.ax);
		System.out.println("====메소드 호출====");
		out.aa();

	}

}
