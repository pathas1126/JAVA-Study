package j200207;

// ������ CRUD

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {

		// List ���� ���ο� �迭�� ����� ����, �ε�����ȣ�� ����
		// String ���� �ڷḸ ���� ����
		ArrayList<String> list = new ArrayList<String>();

		// add(index), list �迭�� �� �Է�
		// �߰��� �����ʹ� �տ������� ������� �����
		list.add("����");
		list.add("����");
		System.out.println(list);

		// add(index, element), index 1�� "Ű��" �� ����
		list.add(1, "Ű��");
		System.out.println(list);

		// set(index, element), index 0�� ��Ҹ� "������"�� ����
		list.set(0, "������");
		System.out.println(list);

		// remove(index), index 2�� ��� ����
		list.remove(2);
		System.out.println(list);

		// size(), list ���� ��� ���� ��ȯ
		System.out.println(list.size());

		// get(index), index ��ġ�� �� ��ȯ
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Ȯ�� for�� ��� ����
		for (String s : list) {
			System.out.println(s);
		}

	}

}
