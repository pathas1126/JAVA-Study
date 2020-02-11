package j200211;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc1 = Test.getInstance();
		Scanner sc2 = Test.getInstance();

		System.out.println("두 객체는 같은 객체인가요?");
		if (sc1 == sc2) {
			System.out.println("네 같은 객체입니다.");
		} else {
			System.out.println("아닙니다.");
		}

//		Test t = new Test(); 새로운 객체 생성 불가

	}
}
