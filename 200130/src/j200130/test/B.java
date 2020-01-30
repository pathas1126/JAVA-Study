package j200130.test;

public class B {

	public static void main(String[] args) {

		// Public_같은 패키지의 다른 클래스에서 접근 가능
		A a = new A();

		// Private_같은 패키지에서도 클래스가 다르다면 접근 불가
		System.out.println("=====private=====");
//		a.i = 100;		// is not visible : 접근이 불가능할 때 출력되는 에러
//		a.print();

		// Default_같은 패키지에서는 접근 가능
		System.out.println("=====default=====");
		a.j = 200;
		a.print2();

		// Protected_같은 패키지에서 접근 가능
		System.out.println("=====protected=====");
		a.k = 300;
		a.print3();

		// Public_같은 패키지의 다른 클래스에서 접근 가능
		System.out.println("=====public=====");
		a.m = 400;
		a.print4();
	}

}
