package j200129;

// ���� �̻� �������� ������ ������ Ŭ����, Employee Ŭ���� ���
class Manager extends Employee {
	/*
	 * ��� ���� ��� ���� String name; int age; String gender; String addr; long salary;
	 */

	String department;

	// ��ü �迭, ���� �ڷ����� ��ü�� ����� �迭
	Employee sub[]; // ���� ������� ������ ��� Ŭ������ ��� ������ ����� ��ü �迭

	// �����ڴ� ��ӹ��� �� ���� ������ ���� �ۼ� �ؾ� ��
	public Manager() {
	}

	public Manager(String name, int age, String gender, long salary, String addr, String department) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.addr = addr;
		this.department = department;
	}

	// Employee Ŭ������ bonus() �޼ҵ� �������̵�
	double bonus() {
		return salary * 3.0;
	}
}

public class Company {

	public static void main(String[] args) {
		// ���Ի�� 3�� ä��
		Employee e1 = new Employee("ȫ�浿", 23, "��", "����� ���ϱ�", 1500);
		Employee e2 = new Employee("�̼���", 25, "��", "��⵵ ���ֽ�", 2100);
		Employee e3 = new Employee("������", 22, "��", "������ �߱�", 1700);

		// �μ���ġ(���ߺ�)
		Manager m1 = new Manager("�̼���", 42, "��", 3000, "����� ������", "���� 1��");
		m1.sub = new Employee[3];
		m1.sub[0] = e1;
		m1.sub[1] = e2;
		m1.sub[2] = e3;

		// ��� ���� ���, Employee�� ��ӹ޾ұ� ������ Employee�� display() �޼ҵ� ��� ����
		System.out.println("====���� ���====");
		for (int i = 0; i < m1.sub.length; i++) {
			m1.sub[i].display();
		}

		// ���� ���
		System.out.println("====����====");
		m1.display();

	}
}
