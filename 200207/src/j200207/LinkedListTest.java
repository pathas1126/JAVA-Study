package j200207;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {

		// List 구조 내부에 배열이 저장된 구조, 인덱스번호로 구분
		// String 형의 자료만 저장 가능
		LinkedList<String> list = new LinkedList<String>();

		// add(index), list 배열에 값 입력
		// 추가한 데이터는 앞에서부터 순서대로 저장됨
		list.add("포도");
		list.add("딸기");
		System.out.println(list);

		// add(index, element), index 1에 "키위" 값 삽입
		list.add(1, "키위");
		System.out.println(list);

		list.addFirst("딸기");
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
	}

}
