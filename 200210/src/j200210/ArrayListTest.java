package j200210;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {

		// List ���� ���ο� �迭�� ����� ����, �ε�����ȣ�� ����
		// String ���� �ڷḸ ���� ����
		ArrayList<String> list = new ArrayList<String>();

		// add(index), list �迭�� �� �Է�
		// �߰��� �����ʹ� �տ������� ������� �����
		list.add("��");
		list.add("����");
		list.add("������");
		list.add("��纣��");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}