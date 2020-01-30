package j200130;

class A extends Object{
	// �⺻ ������
	public A() {
		super();
		System.out.println("A Ŭ���� �⺻������ ȣ��");
	}
}

class B extends A {
	// �⺻ ������
	public B() {
		super();
		System.out.println("B Ŭ���� �⺻������ ȣ��");
	}
	
	public B(String s) {
		super();
		System.out.println("BŬ���� ������ ȣ��: "+s);
	}
}

class C extends B {
	// �⺻ ������
	public C() {
		super("�ȳ�!!");
		System.out.println("C Ŭ���� �⺻������ ȣ��");
	}

	// �Ű������� 1�� �޴� ������
	public C(String s) {
		super();
		System.out.println("C Ŭ���� ������ ȣ��: " + s);
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// CŬ���� ��ü ����, CŬ������ �Ű������� �ִ� ������ ȣ��
		C c1 = new C("ȫ�浿");
		System.out.println("================");
		// CŬ���� ��ü ����, CŬ������ �⺻ ������ ȣ��
		C c2 = new C();

	}

}
