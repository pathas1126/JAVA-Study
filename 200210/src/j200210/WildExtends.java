package j200210;

import java.util.*;

// Person ��� X Ŭ����
class Test {
	String name;

}

// Person Ŭ����
class Person {
	String name;

}

// Person ��� Man Ŭ����
class Man extends Person {
	// ������
	Man(String name) {
		this.name = name;
	}

	// name ��ȯ �޼ҵ�
	public String toString() {
		return name.toString();
	}
}

// Person ��� Woman Ŭ����
class Woman extends Person {
	Woman(String name) {
		this.name = name;
	}

	public String toString() {
		return name.toString();
	}
}

public class WildExtends {

	public static void main(String[] args) {

		// Person
		List<Person> listP = new ArrayList<Person>();
		listP.add(new Person());
		printData(listP);		// j200210.Person@15db9742

		// Man
		List<Man> listM = new ArrayList<Man>();
		listM.add(new Man("�̼���"));
		listM.add(new Man("������"));
		listM.add(new Man("��ȿ��"));
		printData(listM);	// �̼���	������	��ȿ��

		// Woman
		List<Woman> listW = new ArrayList<Woman>();
		listW.add(new Woman("������"));
		listW.add(new Woman("�鿹��"));
		listW.add(new Woman("������"));
		printData(listW);	//	������	�鿹��	������

		// Test
		List<Test> listT = new ArrayList<Test>();
		listT.add(new Test());
//		printData(listT); �� Person Ŭ������ ��ӹ��� �ʾұ� ������ �޼ҵ� ȣ�� �Ұ�

	}

	// Person Ŭ������ ��ӹ޾Ƽ� ������ �ν��Ͻ��� �Ű������� ���� ����
	public static void printData(List<? extends Person> list) {
		for (Person obj : list) {
			System.out.println(obj);
		}
	}

}
