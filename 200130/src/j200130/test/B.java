package j200130.test;

public class B {

	public static void main(String[] args) {

		// Public_���� ��Ű���� �ٸ� Ŭ�������� ���� ����
		A a = new A();

		// Private_���� ��Ű�������� Ŭ������ �ٸ��ٸ� ���� �Ұ�
		System.out.println("=====private=====");
//		a.i = 100;		// is not visible : ������ �Ұ����� �� ��µǴ� ����
//		a.print();

		// Default_���� ��Ű�������� ���� ����
		System.out.println("=====default=====");
		a.j = 200;
		a.print2();

		// Protected_���� ��Ű������ ���� ����
		System.out.println("=====protected=====");
		a.k = 300;
		a.print3();

		// Public_���� ��Ű���� �ٸ� Ŭ�������� ���� ����
		System.out.println("=====public=====");
		a.m = 400;
		a.print4();
	}

}
