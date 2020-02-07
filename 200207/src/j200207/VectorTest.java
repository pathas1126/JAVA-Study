package j200207;

// 컬렉션 공통 특징: 객체만 저장, 동적 배열(크기가 유동적임)
// 저장된 데이터를 꺼내올 때 원래의 자료형으로 변환시켜야 함

// 컬렉션 단점
// Object로 저장하기 때문에 원래 자료형을 신경쓰지 않고 아무거나 저장됨
// 꺼내와서 원래 자료형으로 저장하는 과정에서 문제가 발생(각각의 요소들을 형 변환 해야 함)
// -> 제너릭

import java.util.*;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> v = new Vector(); // Vector (생성 개수, 증가치) 기본값 (1, 1), 1개를 생성해서 1칸씩 배열 크기가 증가
		v.add("test"); // 컬렉션에서 제공하는 메소드를 오버라이딩 한 메소드
		v.addElement("test2"); // Vector 고유 메소드
		v.add("test3");
		System.out.println("v의 데이터 저장 개수: " + v.size());

		// 값 출력
		for (int i = 0; i < v.size(); i++) {
			// 객체 형태로 데이터가 저장되기 때문에 Object형을 String형으로 형 변환 해야 함
			String temp = (String) v.elementAt(i);
			System.out.println(temp);
		}

		Vector v2 = new Vector();
		// char c = 'a' 컬렉션에는 기본 자료형이 저장될 수 없음
		/*
		 * Character c ='a'; v2.add(c); System.out.println(v2);
		 */

		// 변수를 바로 넣으면 Wrapper 클래스로 오토박싱된 후 v2에 Object형태로 저장됨
		v2.add('a');
		v2.add(100);
		System.out.println(v2);

		// v2의 1번째 인덱스에 50의 값을 저장
		v2.insertElementAt(50, 1);
		System.out.println(v2);

		// 1번 인덱스의 값을 "Set"으로 변경
		v2.setElementAt("Set", 1);
		System.out.println(v2);

		// 벡터 내부의 요소들을 다른 변수에 저장할 때는 형 변환을 해야함 Obejct -> 해당 자료형
		// 출력만 할 때는 형 변환 할 필요 X
	}

}
