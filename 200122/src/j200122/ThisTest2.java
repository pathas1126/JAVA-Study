package j200122;

public class ThisTest2 {

	// 기본 생성자
	ThisTest2() {
		// 자기 클래스 생성자 내부에서는 자기 클래스 객체명을 사용X -> this 사용
		System.out.println("현재 생성된 객체: " + this);
	}

	ThisTest2 returnSelf() {
		return this;
	}

	public static void main(String[] args) {

		ThisTest2 tt = new ThisTest2();
		ThisTest2 ttt = tt.returnSelf();
		System.out.println("반환된 this 값: " + ttt); // tt객체 참조 변수 반환
		System.out.println("현재 main()에서 생성된 tt객체: " + tt);

		ThisTest2 tt2 = new ThisTest2();
		System.out.println("현재 main()에서 생성된 tt2객체: " + tt2);
	}

}
