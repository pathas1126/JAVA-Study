package j200207;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {

		// List ���� ���ο� �迭�� ����� ����, �ε�����ȣ�� ����
		// String ���� �ڷḸ ���� ����
		LinkedList<String> list = new LinkedList<String>();

		// add(index), list �迭�� �� �Է�
		// �߰��� �����ʹ� �տ������� ������� �����
		list.add("����");
		list.add("����");
		System.out.println(list);

		// add(index, element), index 1�� "Ű��" �� ����
		list.add(1, "Ű��");
		System.out.println(list);

		list.addFirst("����");
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
	}

}
