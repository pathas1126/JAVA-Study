package j200130;
// ��Ӱ� �����ڿ��� ����

// class Parent extends Object �� ������ ����
class Parent {
	String name;
	int age;

	Parent() {
		System.out.println("�θ� Ŭ����_�⺻ ������ ȣ��");
	}

	Parent(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("super ������ ȣ��");
	}

	// Object Ŭ�����κ��� �������� toString()�޼ҵ� �������̵�
	public String toString() {
		return "������ �����ص� �ǳ���?";
	}
}

class Child extends Parent {
	Child() {
		super("ȫ�浿", 24);
		System.out.println("�ڽ� Ŭ����_�⺻ ������ ȣ��");

	}

	void printInfo() {
		System.out.println("�̸�: " + name + ", ����: " + age);
	}
}

public class InheriTest {

	public static void main(String[] args) {

		Parent pt = new Parent();
		System.out.println("pt.toString(): " + pt.toString());

		Child cd = new Child();
		System.out.println("cd.toString(): " + cd.toString());
		cd.printInfo();

	}

}
