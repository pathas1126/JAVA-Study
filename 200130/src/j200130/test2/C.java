package j200130.test2;

// A Ŭ������ �ٸ� ��Ű���� �ֱ� ������ import, *�� ����ϸ� �ش� ��Ű���� ��� Ŭ���� import
import j200130.test.*;

public class C extends A {

	public static void main(String[] args) {
		// Public_�ܺ� ��Ű���� �ٸ� Ŭ���������� ���� ����
		A a = new A();

		// Private_�ܺ� Ŭ���� �� �ܺ� ��Ű������ ���� �Ұ�
		System.out.println("=====private=====");
//		a.i = 10;
//		a.print();

		// Default_�ܺ� ��Ű������ ���� �Ұ�
		System.out.println("=====default=====");
//		a.j = 200;	
//		a.print2();
		
		// j200130.test ��Ű���� A Ŭ������ ��ӹ��� C Ŭ������ �ν��Ͻ��ε� ���� �Ұ�
		C c = new C();
//		c.j= 300;
//		c.print2();

		// Protected_�ܺ� ��Ű������ A Ŭ������ ������ �ν��Ͻ��δ� ���� �Ұ�
		System.out.println("=====protected=====");
//		a.k = 300;
//		a.print3();
		
		// j200130.test.A Ŭ������ ��ӹ��� j200130.test2.C Ŭ������ �ν��Ͻ��δ� ���� ����
		c.k = 300;
		c.print3();

		// Public_�ܺ� ��Ű���� �ٸ� Ŭ���������� ���� ����
		System.out.println("=====public=====");
		a.m = 400;
		a.print4();

	}

}
