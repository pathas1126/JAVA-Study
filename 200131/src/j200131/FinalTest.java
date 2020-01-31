package j200131;

// final 사용례

// 3. final + 클래스 => 상속 금지 클래스, 클래스의 어떠한 내용도 수정할 수 없게 해야 하는 경우에 사용
final class Parent extends Object {

	// 1. final + 멤버 변수 or 지역 변수 => 상수화 되어 값이 고정됨
	final int COUNT = 1;

	// 2. final + 메소드 => 상속은 허용하지만 메소드 오버라이딩(재정의) 금지
	// 읽기 전용 메소드, 메소드의 원래 목적과 상관 없는 기능으로 변경하는 것을 방지하기 위함
	// 정적 메소드에 많이 사용됨
	final void sub() {
		System.out.println("메소드 재정의 제한");
	}


//	public class FinalTest extends Parent { // The type FinalTest cannot subclass the final class Parent

//	void sub() {	//Cannot override the final method from Parent
//		System.out.println("final 메소드는 오버라이딩 불가");
//	}

	public static void main(String[] args) {
		// Parent 클래스 객체 생성
		Parent p = new Parent();
//		p.COUNT = 5;		//	The final field Parent.count cannot be assigned, 상수는 값을 새롭게 받을 수 없음
		System.out.println("p.count: " + p.COUNT);

		// FinalTest 클래스(Parent 클래스 상속) 객체 생성
//		FinalTest ft = new FinalTest();
//		ft.sub();
	}

}
