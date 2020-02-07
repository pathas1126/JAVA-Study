package j200207;

// 데이터 CRUD

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {

		// List 구조 내부에 배열이 저장된 구조, 인덱스번호로 구분
		// String 형의 자료만 저장 가능
		ArrayList<String> list = new ArrayList<String>();

		// add(index), list 배열에 값 입력
		// 추가한 데이터는 앞에서부터 순서대로 저장됨
		list.add("포도");
		list.add("딸기");
		System.out.println(list);

		// add(index, element), index 1에 "키위" 값 삽입
		list.add(1, "키위");
		System.out.println(list);

		// set(index, element), index 0의 요소를 "복숭아"로 변경
		list.set(0, "복숭아");
		System.out.println(list);

		// remove(index), index 2의 요소 삭제
		list.remove(2);
		System.out.println(list);

		// size(), list 내의 요소 개수 반환
		System.out.println(list.size());

		// get(index), index 위치의 값 반환
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 확장 for문 사용 가능
		for (String s : list) {
			System.out.println(s);
		}

	}

}
