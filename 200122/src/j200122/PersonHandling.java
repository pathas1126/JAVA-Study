package j200122;

class Person {

	// ��� ����
	private String name; // �̸�
	private int age; // ����

	// �⺻ ������
	Person() {
		System.out.println("�⺻ ������ ȣ��");
	}

	// ������ �����ε� : ������ ���� ���� = 2�� ������� ���� ����(�⺻������ ����)
	Person(String name) {
		this.name = name;
	}

	Person(int age) {
		this.age = age;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// set() �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("������ ���� ������ �� �����ϴ�!");
			age = 23; // �⺻�� ����
		}
	}

	// get() �޼ҵ�
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// �޼ҵ�
	void display() {
		System.out.println("�̸�: " + name + ", ����: " + age);
	}
}

public class PersonHandling {

	public static void main(String[] args) {

		Person p = new Person(); // Person Ŭ������ ��ü p�� �����ϸ鼭 �⺻������ Person ȣ��
		System.out.println("p: " + p); // p: j200122.Person@15db9742
		p.display(); // �̸�: null, ����: 0

		Person p2 = new Person(23);
		p2.display(); // �̸�: null, ����: 23

		Person p3 = new Person("ȫ�浿");
		p3.display(); // �̸�: ȫ�浿, ����: 0

		Person p4 = new Person("������", 23);
//		�� �ڵ�� ������ ���� �ۼ� ����
//		Person p4 = new Person();
//		p4.setName("������");
//		p4.setAge(23);
		p4.display(); // �̸�: ������, ����: 23
	}

}
