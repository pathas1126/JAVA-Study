package j200203;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���");
		String input = sc.nextLine();
		System.out.println("�Է� ���ڿ�: " + input);

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
		System.out.println("s.replace(���� �� �ܾ�, ���� �� �ܾ�): " + s.replace('l', 't'));
		System.out.println("s.length(): " + s.length());
		System.out.println("s.charAt(2): "+s.charAt(2));
		System.out.println("s.indexOf('e'): "+s.indexOf('e'));
	}
}
