package j200205;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 단 입력
			System.out.println("출력할 단을 입력하세요");
			// 문자열로 먼저 입력을 받음
			String input = sc.next();
			// 문자열이 Q 또는 q라면 프로그램 종료
			if (input.contentEquals("Q") || input.contentEquals("q")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				// 아닌 경우에 구구단 출력
			} else {
				// 문자열을 int형으로 변환
				int dan = Integer.parseInt(input);
				if (dan > 9 || dan < 2) {
					System.out.println("숫자는 2~9까지만 입력해주세요.");
				} else {
					// 단 출력
					System.out.println(dan + "단★");
					for (int i = 1; i <= 9; i++) {
						System.out.println(dan + " x " + i + " = " + (dan * i));
					}
				}

			}
		}

	}

}
