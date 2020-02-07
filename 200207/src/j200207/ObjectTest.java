package j200207;

// ��ü ��ü(��� ����)�� ���Ϸ� ���� 

import java.io.*;

// ����ȭ ��ü�� Ŭ������ �ݵ�� Serializable �������̽��� �����ؾ� ��
class Person implements Serializable {
	String name;
	int age;
	String addr;
	transient String gender;
}

public class ObjectTest {

	// ����� �޼ҵ带 ����ϱ� ������ �ݵ�� ���� ó���� �ؾ� ��
	public static void main(String[] args) throws  Exception {

		// Person ��ü ����
		Person p = new Person();

		// p ��ü ���� �ʱ�ȭ
		p.name = "ȫ�浿";
		p.age = 34;
		p.addr = "��⵵ �����";
		p.gender = "����";

		// ��ü �ּ� ���
		System.out.println(p);

		// p ��ü name, gender ���� �� ���
		System.out.println(p.name);
		System.out.println(p.gender);

		// �ѱ��� ������ ��ü�� �����ϱ� ������ FileOutputStream ���
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));

		// p ��ü�� ���Ͽ� �ۼ�
		oos.writeObject(p);

		// ��Ʈ�� ��� �� �޸� ����
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));

		// ��� ������ ��ü�� �����ؾ� �ϱ� ������ Object Ŭ���������� �����
		Object pr = ois.readObject();

		// pr ��ü�� Person Ŭ������ �ν��Ͻ����� Ȯ��
		System.out.println(pr instanceof Person);
		System.out.println(pr);

		// pr ��ü�� Person �ڷ����� pp ��ü�� �� ��ȯ(Downcasting)
		Person pp = (Person) pr;

		// pp ��ü �ּ� ���
		System.out.println(pp);

		// pp ��ü name ���� �� ���
		System.out.println(pp.name);

		// pp ��ü gender ���� �� ���
		System.out.println(pp.gender);

		// ��Ʈ�� ��� �� �޸� ����
		ois.close();

	}

}
