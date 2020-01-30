package j200130;

// ���� �ó�����
// ȸ�翡 �Ի�, ���� ��� -> �μ���ġ(���� 1��)
// �޿�: ������ + �б⺰ ���ʽ�(����: 150%, ����(�߰�������) 300%)

// ���� ��� Ŭ����
public class Employee {

	// 1. ���� ��� ����
	String name;
	int age;
	String gender;
	String addr;
	long salary;

	// 2. ������ �����ε�
	public Employee() {

	}

	// ��Ŭ������ ������ �ۼ� : Source -> Generate Constructor usiing Fields
	public Employee(String name, int age, String gender, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
		this.salary = salary;
	}

	// 3. ���ʽ��� ��ȯ�ϴ� �޼ҵ�
	double bonus() {
		return salary * 1.5;
	}

	// 4. ����Ǿ� �ִ� ���� �״�� ����ϴ� �޼ҵ�
	void display() {
		System.out.println("===���� ����===");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + gender);
		System.out.println("�ּ�: " + addr);
		System.out.println("�޿�: " + salary);
		// �޼ҵ� ���ο��� ���� Ŭ���� ���� �Ϲ� �޼ҵ� ȣ��
		System.out.println("���ʽ�: " + bonus());
	}

	public static void main(String[] args) {

		String str = "Hello, My Friend!";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < 5; i++) {
			System.out.print(ch[i] + " ");
		}
	}

}