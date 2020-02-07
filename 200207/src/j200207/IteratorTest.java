package j200207;

import java.util.*;

public class IteratorTest {

	public static void main(String[] args) {

		// ArrayList 컬렉션 객체 생성
		ArrayList<String> al = new ArrayList();
		al.add("홍길동");
		al.add("이순신");
		al.add("세종대왕");
		System.out.println(al); // [홍길동, 이순신, 세종대왕]

		// Iterator 객체 생성
		Iterator<String> it = al.iterator();

		// Iterator 요소 조회
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 홍길동 이순신 세종대왕

		// HashMap 컬렉션 객체 생성
		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "강감찬");
		hm.put(2, "유성룡");
		hm.put(3, "정약용");
		System.out.println(hm); // {1=강감찬, 2=유성룡, 3=정약용}

		// HashMap에는 Iterator를 반환하는 메소드가 없기 때문에 Collection으로 반환해서
		// 컬렉션 객체를 생성한 뒤에 컬렉션의 iterator()메소드로 iterator를 반환해서 객체 생성
		Collection<String> cl = hm.values();
		Iterator ir = cl.iterator();

		System.out.println(ir.next()); // 강감찬
		ir.remove();
		System.out.println(ir.next()); // 유성룡
		ir.remove();
		System.out.println(ir.next()); // 정약용
		for (int i = 1; i < 4; i++) {
			System.out.println(hm.get(i));
		}
		// null null 정약용
	}

}