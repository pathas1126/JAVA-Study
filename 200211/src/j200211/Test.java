package j200211;

import java.util.Scanner;

public class Test {

	// 생성자에 private 부여
	private Test() {
	}

	// Scanner 클래스 변수 sc에 private 부여
	private static Scanner sc;

	// Scanner 객체 반환 메소드
	public static Scanner getInstance() {
		synchronized (Test.class) {
			if (sc == null) {
				sc = new Scanner(System.in);
			}
			return sc;
		}
	}

}
