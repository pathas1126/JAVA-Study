package j200204;

import java.util.Scanner;

public class OpTest {

	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		// 첫 번째 숫자 입력
		System.out.println("첫 번째 숫자 입력");
		String firstStr = sc.nextLine();
		// String으로 들어오기 때문에 int형으로 변환
		int first = Integer.parseInt(firstStr);

		// 연산자 입력
		System.out.println("연산자 선택: +, -, *, /");
		String oper = sc.nextLine();

		// 두 번째 숫자 입력
		System.out.println("두 번째 숫자 입력");
		String secondStr = sc.nextLine();
		// int 형으로 변환
		int second = Integer.parseInt(secondStr);
		// 결과 변수 선언
		int result = 0;

		// 스위치 문으로 연산자에 따른 계산 처리
		switch (oper) {
		case "+":
			result = first + second;
			break;
		case "-":
			result = first - second;
			break;
		case "*":
			result = first * second;
			break;
		case "/":
			result = first / second;
		}

		// 결과 출력
		System.out.println("결과: " + result);

	}
	// next(), nextLine() 모두 결과가 동일하게 나와서 nextLine()으로 둠
}
