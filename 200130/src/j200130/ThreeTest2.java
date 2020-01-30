package j200130;

import java.util.Scanner;

public class ThreeTest2 {

	// 최댓값 일반 메소드
	public int getMax(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// 최댓값 정적 메소드
	public static int getMaxS(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// 최댓값 진수 출력 일반 메소드
	public void printMax(int max) {
		System.out.println(max + "의 2진수: " + Integer.toBinaryString(max));
		System.out.println(max + "의 8진수: " + Integer.toOctalString(max));
		System.out.println(max + "의 16진수: " + Integer.toHexString(max));
	}

	// 최댓값 진수 출력 정적 메소드
	public static void printMaxS(int max) {
		System.out.println(max + "의 2진수: " + Integer.toBinaryString(max));
		System.out.println(max + "의 8진수: " + Integer.toOctalString(max));
		System.out.println(max + "의 16진수: " + Integer.toHexString(max));
	}

	public static void main(String[] args) {
		// ========main에 작성=======//

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		// int a, b, c 변수에 각 숫자 입력
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int c = sc.nextInt();

		// 최댓값 변수 max 선언 후 최댓값 저장
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;

		// 출력
		System.out.println("최댓값: " + max);
		System.out.println(max + "의 2진수: " + Integer.toBinaryString(max));
		System.out.println(max + "의 8진수: " + Integer.toOctalString(max));
		System.out.println(max + "의 16진수: " + Integer.toHexString(max));

		// ThreeTest2 객체 생성 후 일반 메소드 사용
		ThreeTest2 tt2 = new ThreeTest2();
		System.out.println("최댓값: " + tt2.getMax(a, b, c));
		tt2.printMax(max);

		// ThreeTest2 정적 메소드 사용
		System.out.println("최댓값: " + ThreeTest2.getMaxS(a, b, c));
		ThreeTest2.printMaxS(max);

	}

}