package j200130.test;

// 접근 제어자 예제
public class A {
	// Private
	private int i = 10;

	// Default
	int j;

	// Protected
	protected int k;
	
	// Public
	public int m;

	// Private, 자기 클래스 내부에서만 사용할 목적으로 만들어진 메소드에 부여
	// 외부에서 사용할 방법이 없음
	private void print() {
		System.out.println("private i: " + i);
	}

	// Default
	void print2() {
		System.out.println("default j: " + j);
	}

	// Protected
	protected void print3() {
		System.out.println("protected k: " + k);
	}
	
	// Public
	public void print4() {
		System.out.println("public m: " + m);
	}
	
	public static void main(String[] args) {

		// Public
		A a = new A();

		// Private_동일 클래스에서만 접근 가능
		System.out.println("=====private=====");
		a.i = 100;
		a.print();

		// Default_동일 패키지에서만 접근 가능
		System.out.println("=====default=====");
		a.j = 200;
		a.print2();

		// Protected
		System.out.println("=====protected=====");
		a.k = 300;
		a.print3();
		
		// Public
		System.out.println("=====public=====");
		a.m = 400;
		a.print4();

	}

}
