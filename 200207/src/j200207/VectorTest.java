package j200207;

// �÷��� ���� Ư¡: ��ü�� ����, ���� �迭(ũ�Ⱑ ��������)
// ����� �����͸� ������ �� ������ �ڷ������� ��ȯ���Ѿ� ��

// �÷��� ����
// Object�� �����ϱ� ������ ���� �ڷ����� �Ű澲�� �ʰ� �ƹ��ų� �����
// �����ͼ� ���� �ڷ������� �����ϴ� �������� ������ �߻�(������ ��ҵ��� �� ��ȯ �ؾ� ��)
// -> ���ʸ�

import java.util.*;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> v = new Vector(); // Vector (���� ����, ����ġ) �⺻�� (1, 1), 1���� �����ؼ� 1ĭ�� �迭 ũ�Ⱑ ����
		v.add("test"); // �÷��ǿ��� �����ϴ� �޼ҵ带 �������̵� �� �޼ҵ�
		v.addElement("test2"); // Vector ���� �޼ҵ�
		v.add("test3");
		System.out.println("v�� ������ ���� ����: " + v.size());

		// �� ���
		for (int i = 0; i < v.size(); i++) {
			// ��ü ���·� �����Ͱ� ����Ǳ� ������ Object���� String������ �� ��ȯ �ؾ� ��
			String temp = (String) v.elementAt(i);
			System.out.println(temp);
		}

		Vector v2 = new Vector();
		// char c = 'a' �÷��ǿ��� �⺻ �ڷ����� ����� �� ����
		/*
		 * Character c ='a'; v2.add(c); System.out.println(v2);
		 */

		// ������ �ٷ� ������ Wrapper Ŭ������ ����ڽ̵� �� v2�� Object���·� �����
		v2.add('a');
		v2.add(100);
		System.out.println(v2);

		// v2�� 1��° �ε����� 50�� ���� ����
		v2.insertElementAt(50, 1);
		System.out.println(v2);

		// 1�� �ε����� ���� "Set"���� ����
		v2.setElementAt("Set", 1);
		System.out.println(v2);

		// ���� ������ ��ҵ��� �ٸ� ������ ������ ���� �� ��ȯ�� �ؾ��� Obejct -> �ش� �ڷ���
		// ��¸� �� ���� �� ��ȯ �� �ʿ� X
	}

}
