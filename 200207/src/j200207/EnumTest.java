package j200207;

import java.util.*;

public class EnumTest {

	public static void main(String[] args) {

		Vector<String> al = new Vector();
		al.add("test1"); al.add("test2"); al.add("test3");
		
		
		HashMap<Integer, String> h = new HashMap(); 
		h.put(1, "홍길동");
		h.put(2, "서울시 강남구");
		h.put(3, "010-2312-1241");
		System.out.println(h);
		String a = h.get(1);
		System.out.println(a);
		
		// 컬렉션의 구조가 다르다 할지라도 공통으로 검색하는 인터페이스: Enumeration, Iterator
		// 인터페이스이기 때문에 elements() 메소드의 반환형으로 생성
		Enumeration <String> eu = al.elements();
		while(eu.hasMoreElements()) {
			System.out.println(eu.nextElement());
		}
		
		// Iterator 순서가 정해져 있지 않은 자료 구조에서 데이터 검색 ex) 도서관에서 책 찾기

		
		// 콜렉션 객체를 먼저 얻어 옴
		Collection<String> c = h.values();
		Iterator<String> ih = c.iterator();
		
		// hasNext() 검색된 데이터가 있는지 확인, next() 찾은 데이터가 있으면 하나씩 반환
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
		
		// 인터페이스로 객체를 얻어오는 방법
		/* 
		인터페이스는 new연산자로 객체 생성 불가 => 인터페이스 구현 클래스 객체를 통해서 인터페이스 객체를 얻어옴
		1. 메소드의 매개변수를 통해서 얻어오는 방법 => 서블릿에서 사용한다고 함
		2. 메소드의 반환형을 통해서 얻어오는 방법	List list = new ArrayList(); Upcasting 활용
		*/
		
	}
}


