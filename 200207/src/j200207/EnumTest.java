package j200207;

import java.util.*;

public class EnumTest {

	public static void main(String[] args) {

		Vector<String> al = new Vector();
		al.add("test1"); al.add("test2"); al.add("test3");
		
		
		HashMap<Integer, String> h = new HashMap(); 
		h.put(1, "ȫ�浿");
		h.put(2, "����� ������");
		h.put(3, "010-2312-1241");
		System.out.println(h);
		String a = h.get(1);
		System.out.println(a);
		
		// �÷����� ������ �ٸ��� ������ �������� �˻��ϴ� �������̽�: Enumeration, Iterator
		// �������̽��̱� ������ elements() �޼ҵ��� ��ȯ������ ����
		Enumeration <String> eu = al.elements();
		while(eu.hasMoreElements()) {
			System.out.println(eu.nextElement());
		}
		
		// Iterator ������ ������ ���� ���� �ڷ� �������� ������ �˻� ex) ���������� å ã��

		
		// �ݷ��� ��ü�� ���� ��� ��
		Collection<String> c = h.values();
		Iterator<String> ih = c.iterator();
		
		// hasNext() �˻��� �����Ͱ� �ִ��� Ȯ��, next() ã�� �����Ͱ� ������ �ϳ��� ��ȯ
			System.out.println(ih.next());
			ih.remove();
			System.out.println(ih.next());
			ih.remove();

			while(ih.hasNext()) {
				
				System.out.println(ih.next());
			}

			for(int i = 1; i <4; i++) {
				System.out.println(h.get(i));
			}
			
		//ih.remove();
		
		// �������̽��� ��ü�� ������ ���
		/* 
		�������̽��� new�����ڷ� ��ü ���� �Ұ� => �������̽� ���� Ŭ���� ��ü�� ���ؼ� �������̽� ��ü�� ����
		1. �޼ҵ��� �Ű������� ���ؼ� ������ ��� => �������� ����Ѵٰ� ��
		2. �޼ҵ��� ��ȯ���� ���ؼ� ������ ���	List list = new ArrayList(); Upcasting Ȱ��
		*/
		
	}
}


