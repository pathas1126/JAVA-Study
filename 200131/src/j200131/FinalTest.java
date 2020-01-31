package j200131;

// final ����

// 3. final + Ŭ���� => ��� ���� Ŭ����, Ŭ������ ��� ���뵵 ������ �� ���� �ؾ� �ϴ� ��쿡 ���
final class Parent extends Object {

	// 1. final + ��� ���� or ���� ���� => ���ȭ �Ǿ� ���� ������
	final int COUNT = 1;

	// 2. final + �޼ҵ� => ����� ��������� �޼ҵ� �������̵�(������) ����
	// �б� ���� �޼ҵ�, �޼ҵ��� ���� ������ ��� ���� ������� �����ϴ� ���� �����ϱ� ����
	// ���� �޼ҵ忡 ���� ����
	final void sub() {
		System.out.println("�޼ҵ� ������ ����");
	}


//	public class FinalTest extends Parent { // The type FinalTest cannot subclass the final class Parent

//	void sub() {	//Cannot override the final method from Parent
//		System.out.println("final �޼ҵ�� �������̵� �Ұ�");
//	}

	public static void main(String[] args) {
		// Parent Ŭ���� ��ü ����
		Parent p = new Parent();
//		p.COUNT = 5;		//	The final field Parent.count cannot be assigned, ����� ���� ���Ӱ� ���� �� ����
		System.out.println("p.count: " + p.COUNT);

		// FinalTest Ŭ����(Parent Ŭ���� ���) ��ü ����
//		FinalTest ft = new FinalTest();
//		ft.sub();
	}

}
