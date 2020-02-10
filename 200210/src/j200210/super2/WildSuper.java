package j200210.super2;

import java.util.*;

// Person Ŭ����
class Person {
	String name;

	// ������ �����ε带 �� ���� �⺻ �����ڸ� �ۼ��� �־�� ��
	Person() {
	}

	Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
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

public class WildSuper {

	public static void main(String[] args) {

		// Person
		List<Person> listP = new ArrayList<Person>();
		listP.add(new Person("���"));
		listP.add(new Person("�ΰ�"));
		printData(listP); // ��� �ΰ�

		// Man
		List<Man> listM = new ArrayList<Man>();
		listM.add(new Man("������"));
		listM.add(new Man("��ȿ��"));
		printData(listM); // ������ ��ȿ��

		// Woman
		List<Woman> listW = new ArrayList<Woman>();
		listW.add(new Woman("�鿹��"));
		listW.add(new Woman("������"));
//		printData(listW); �� Man Ŭ������ ���� Ŭ������ �ƴϱ� ������ �޼ҵ� ȣ�� �Ұ�

	}

	// Man Ŭ������ �� ���� Ŭ������ ������ �ν��Ͻ��� �Ű������� ���� ����
	public static void printData(List<? super Man> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
