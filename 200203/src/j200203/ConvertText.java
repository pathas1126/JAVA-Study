package j200203;

import java.util.Scanner;

// 입력받은 문자열 대소문자 바꾸기

public class ConvertText {

	public static void main(String[] args) {
		// A~Z: 65~ 90, a~z: 97~ 122

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		// 문자열 입력 받기
		System.out.println("문자열을 입력하시오");
		String input = sc.nextLine();

		// 입력받은 문자열 각각의 문자가 담길 변수 초기화
		char ch = 'a';

		// 결과 문자열 변수 초기화
		String output = "";

		// 문자열 각각의 문자에 대해서 대소문자를 변경
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else if (Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			output = output.concat(String.valueOf(ch));
		}
		System.out.println(output);
	}

}
