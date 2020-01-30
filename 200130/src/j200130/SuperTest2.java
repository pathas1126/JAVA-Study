package j200130;

class Person {
	// ��� ���� ����
	String name; // null
	int age = 20;

	void print() {
		System.out.println("Person �̸�: " + name + ", ����: " + age);
	}
}

class Man extends Person {
	// ��ӹ��� ��������� ���� �̸��� ������ �ڽ�Ŭ�������� ���� ����
	int age = 40;

	void print() {
		super.print();
		System.out.println("Person �̸�: " + super.name + ", ����: " + super.age);
		System.out.println("Man �̸�: " + name + ", ����: " + age);	// �� ���� �տ� this ����
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		
		// Man Ŭ���� m ��ü ����
		Man m = new Man();
		// m ��ü name ���� �ʱ�ȭ
		m.name = "ȫ�浿";
		m.print();
	}

}
