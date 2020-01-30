package j200130.test;

// ���� ������ ����
public class A {
	// Private
	private int i = 10;

	// Default
	int j;

	// Protected
	protected int k;
	
	// Public
	public int m;

	// Private, �ڱ� Ŭ���� ���ο����� ����� �������� ������� �޼ҵ忡 �ο�
	// �ܺο��� ����� ����� ����
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

		// Private_���� Ŭ���������� ���� ����
		System.out.println("=====private=====");
		a.i = 100;
		a.print();

		// Default_���� ��Ű�������� ���� ����
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
