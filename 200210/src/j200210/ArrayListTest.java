package j200210;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {

		// List 구조 내부에 배열이 저장된 구조, 인덱스번호로 구분
		// String 형의 자료만 저장 가능
		ArrayList<String> list = new ArrayList<String>();

		// add(index), list 배열에 값 입력
		// 추가한 데이터는 앞에서부터 순서대로 저장됨
		list.add("귤");
		list.add("딸기");
		list.add("복숭아");
		list.add("블루베리");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}