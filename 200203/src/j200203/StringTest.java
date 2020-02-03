package j200203;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String input = sc.nextLine();
		System.out.println("입력 문자열: " + input);

		stringPrint(input);
	}

	public static void stringPrint(String s) {
		System.out.println("s.trim(): "+s.trim());
		s = s.trim();
		System.out.println("s.concat('test'): " + s.concat("test"));
		System.out.println("s.substring(1,4): " + s.substring(1, 4));
		System.out.println("s.substring(1): " + s.substring(1));
		System.out.println("s.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());
		System.out.println("s.replace(변경 전 단어, 변경 후 단어): " + s.replace('l', 't'));
		System.out.println("s.length(): " + s.length());
		System.out.println("s.charAt(2): "+s.charAt(2));
		System.out.println("s.indexOf('e'): "+s.indexOf('e'));
	}
}
