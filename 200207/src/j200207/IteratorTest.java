package j200207;

import java.util.*;

public class IteratorTest {

	public static void main(String[] args) {

		// ArrayList �÷��� ��ü ����
		ArrayList<String> al = new ArrayList();
		al.add("ȫ�浿");
		al.add("�̼���");
		al.add("�������");
		System.out.println(al); // [ȫ�浿, �̼���, �������]

		// Iterator ��ü ����
		Iterator<String> it = al.iterator();

		// Iterator ��� ��ȸ
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// ȫ�浿 �̼��� �������

		// HashMap �÷��� ��ü ����
		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "������");
		hm.put(2, "������");
		hm.put(3, "�����");
		System.out.println(hm); // {1=������, 2=������, 3=�����}

		// HashMap���� Iterator�� ��ȯ�ϴ� �޼ҵ尡 ���� ������ Collection���� ��ȯ�ؼ�
		// �÷��� ��ü�� ������ �ڿ� �÷����� iterator()�޼ҵ�� iterator�� ��ȯ�ؼ� ��ü ����
		Collection<String> cl = hm.values();
		Iterator ir = cl.iterator();

		System.out.println(ir.next()); // ������
		ir.remove();
		System.out.println(ir.next()); // ������
		ir.remove();
		System.out.println(ir.next()); // �����
		for (int i = 1; i < 4; i++) {
			System.out.println(hm.get(i));
		}
		// null null �����
	}

}