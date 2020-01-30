package j200130.test2;

// A 클래스가 다른 패키지에 있기 때문에 import, *을 사용하면 해당 패키지의 모든 클래스 import
import j200130.test.*;

public class C extends A {

	public static void main(String[] args) {
		// Public_외부 패키지의 다른 클래스에서도 접근 가능
		A a = new A();

		// Private_외부 클래스 및 외부 패키지에서 접근 불가
		System.out.println("=====private=====");
//		a.i = 10;
//		a.print();

		// Default_외부 패키지에서 접근 불가
		System.out.println("=====default=====");
//		a.j = 200;	
//		a.print2();
		
		// j200130.test 패키지의 A 클래스를 상속받은 C 클래스의 인스턴스로도 접근 불가
		C c = new C();
//		c.j= 300;
//		c.print2();

		// Protected_외부 패키지에서 A 클래스로 생성한 인스턴스로는 접근 불가
		System.out.println("=====protected=====");
//		a.k = 300;
//		a.print3();
		
		// j200130.test.A 클래스를 상속받은 j200130.test2.C 클래스의 인스턴스로는 접근 가능
		c.k = 300;
		c.print3();

		// Public_외부 패키지의 다른 클래스에서도 접근 가능
		System.out.println("=====public=====");
		a.m = 400;
		a.print4();

	}

}
