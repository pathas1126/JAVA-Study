package j200129;

public class ArrayOfObject {

	// ��� ���� ����
	String name;
	int age;
	char gender;

	// ������
	ArrayOfObject(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// ���� ��� �޼ҵ�
	void printInfo() {
		System.out.println("�̸�: " + name + ", ����: " + age + ", ����: " + gender);
	}

	public static void main(String[] args) {
		ArrayOfObject[] aoo = new ArrayOfObject[3];

		aoo[0] = new ArrayOfObject("�̼���", 33, '��');
		aoo[1] = new ArrayOfObject("������", 34, '��');
		aoo[2] = new ArrayOfObject("����", 32, '��');

		// ��ü �迭�� ����� ������ �� ���
		for (int i = 0; i < aoo.length; i++) {
			aoo[i].printInfo();
		}
		
		// ��ü �ּҰ� ���
		for (int i = 0; i < aoo.length; i++) {
			System.out.println(aoo[i]);
		}

		// ù ��° ����� �̸��� ����غ���
		System.out.println("�̸�: " + aoo[0].name);
	}

}
