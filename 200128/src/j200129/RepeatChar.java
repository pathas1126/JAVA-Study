package j200129;

// Scanner import
import java.util.Scanner;

public class RepeatChar {

	// 정적 메소드 작성
	static void charPrint(int iterInt, String iterStr) {
		for (int i = 0; i < iterInt; i++) {
			System.out.print(iterStr);
		}
	}

	// 일반 메소드 작성
	void charPrintInstance(int iterInt, String iterStr) {
		for (int i = 0; i < iterInt; i++) {
			System.out.print(iterStr);
		}
	}

	public static void main(String[] args) {

		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// sc객체로 문자를 입력받아서 iterStr 변수에 저장
		System.out.println("반복할 문자를 입력하세요");
		String iterStr = sc.next();

		// sc객체로 정수를 입력받아서 iterInt 변수에 저장
		System.out.println("반복할 횟수를 입력하세요");
		int iterInt = sc.nextInt();

		// 정적 메소드, 바로 사용
		RepeatChar.charPrint(iterInt, iterStr);

		// 줄 바꿈
		System.out.println();
		System.out.println("==============");

		// 일반 메소드, 객체 생성 후 사용
		System.out.println("반복할 문자를 입력하세요");
		iterStr = sc.next();
		System.out.println("반복할 횟수를 입력하세요");
		iterInt = sc.nextInt();
		RepeatChar rc = new RepeatChar();
		rc.charPrintInstance(iterInt, iterStr);

	}

}
