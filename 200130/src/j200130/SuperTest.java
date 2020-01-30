package j200130;

class A extends Object{
	// 기본 생성자
	public A() {
		super();
		System.out.println("A 클래스 기본생성자 호출");
	}
}

class B extends A {
	// 기본 생성자
	public B() {
		super();
		System.out.println("B 클래스 기본생성자 호출");
	}
	
	public B(String s) {
		super();
		System.out.println("B클래스 생성자 호출: "+s);
	}
}

class C extends B {
	// 기본 생성자
	public C() {
		super("안녕!!");
		System.out.println("C 클래스 기본생성자 호출");
	}

	// 매개변수를 1개 받는 생성자
	public C(String s) {
		super();
		System.out.println("C 클래스 생성자 호출: " + s);
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// C클래스 객체 생성, C클래스의 매개변수가 있는 생성자 호출
		C c1 = new C("홍길동");
		System.out.println("================");
		// C클래스 객체 생성, C클래스의 기본 생성자 호출
		C c2 = new C();

	}

}
