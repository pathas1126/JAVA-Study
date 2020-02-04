package j200204;

import java.util.Scanner;

public class ConvertTest2 {

	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		// 문자열 입력 while문
		while (true) {
			System.out.println("문자열을 입력 하세요");
			// 입력 문자열
			String input = sc.nextLine();
			// 출력 문자열 초기화
			String output = "";
			// 문자열 각각의 문자를 담을 변수
			char ch;
			// 대소문자 변경 for 문
			for (int i = 0; i < input.length(); i++) {
				// ch 변수에 input의 i 번째 문자 대입
				ch = input.charAt(i);
				// 영문자 확인
				if (!Character.isLetter(ch)) {
					System.out.println("영문자만 입력이 가능합니다");
					System.exit(0);
				} else {
					// e 또는 E가 들어 있는지 확인
					if (ch == 'e' || ch == 'E') {
						System.out.println("e와 E는 입력 불가능합니다.");
						System.exit(0);
					} else {
						// 대소문자 변경
						if (Character.isLowerCase(ch)) {
							ch = Character.toUpperCase(ch);
							output = output.concat(String.valueOf(ch));
						} else if (Character.isUpperCase(ch)) {
							ch = Character.toLowerCase(ch);
							output = output.concat(String.valueOf(ch));
						}
					}
				}
			}
			// 결과 출력
			System.out.println(output);
			// 줄바꿈
			System.out.println("============");
		}
	}

}
