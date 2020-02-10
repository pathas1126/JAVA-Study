package j200210;

import java.util.*;

public class WildTest {

	public static void main(String[] args) {
		// List는 인터페이스이기 때문에 ArrayList 생성 후 Upcasting 이용
		List<String> list = new ArrayList();
		list.add("test1");
		list.add("test2");
		list.add("test3");

		List<Integer> list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(new Integer(3));
		List<Double> list3 = new ArrayList();
		list3.add(10.1);
		list3.add(11.2);
		list3.add(12.3);

		// static 메소드 호출
		printData(list);
		printData(list2);
		printData(list3);

	}

	// 리스트 출력 메소드
	public static void printData(List<?> list) {
		for (Object v : list) {
			System.out.println(v);
		}
	}

	/*
	 * public static void printData2(List<Integer> list) { for (Integer v : list) {
	 * System.out.println(v); } }
	 * 
	 * public static void printData3(List<Double> list) { for (Double v : list) {
	 * System.out.println(v); } }
	 */

}
