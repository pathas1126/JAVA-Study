package j200205;

import java.util.Scanner;

// 사용자 정의 예외, Exception 클래스 상속
class OverLength extends Exception {
	// 생성자, 예외 메세지를 인자로 전달받아서 예외 객체 생성
	OverLength(String message) {
		super(message);
	}
}

public class PrintString {

	// Overlength 예외를 메소드 호출시 처리하도록 미룸
	static void print() throws OverLength {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		// 문자열 입력
		System.out.println("문자열을 입력해주세요.");
		String str = sc.nextLine();

		// 문자열의 길이가 5자 이상일 때 예외 발생
		if (str.length() >= 5)
			throw new OverLength("문자열은 5자 이상 입력할 수 없습니다.");
	}

	public static void main(String[] args) {
		// 예외 처리
		try {
			PrintString et = new PrintString();
			print();
			// 예외 발생시 예외 정보 출력
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
