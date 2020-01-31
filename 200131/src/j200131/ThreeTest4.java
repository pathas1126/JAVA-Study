package j200131;

import java.util.Scanner;

public class ThreeTest4 {

	// ==================일반 메소드===============//
	// 최댓값 일반 메소드
	public int getMax(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// Scanner 객체를 얻어오는 일반 getter
	public Scanner getScan() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	// Scanner 객체를 넘겨주는 일반 setter
	public void setScan(Scanner sc) {
		// 변수 초기화
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int c = sc.nextInt();

		int max = getMax(a, b, c);

		print(max);
	}

	// 출력 일반 메소드
	public void print(int max) {
		System.out.println("최댓값: " + max);
		System.out.println(max + "의 2진수: " + Integer.toBinaryString(max));
		System.out.println(max + "의 8진수: " + Integer.toOctalString(max));
		System.out.println(max + "의 16진수: " + Integer.toHexString(max));
	};

	// ==================정적 메소드===============//
	// 정적 메소드는 인스턴스 메소드에 접근할 수 없기 때문에 정적메소드도 따로 작성해야 함
	// 최댓값 정적 메소드
	public static int getMaxS(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// Scanner 객체를 얻어오는 정적 getter
	public static Scanner getScanS() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	// Scanner 객체를 넘겨주는 정적 setter
	public static void setScanS(Scanner sc) {
		// 변수 초기화
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int c = sc.nextInt();

		int max = getMaxS(a, b, c);

		printS(max);
	}

	// 출력 정적 메소드
	public static void printS(int max) {
		System.out.println("최댓값: " + max);
		System.out.println(max + "의 2진수: " + Integer.toBinaryString(max));
		System.out.println(max + "의 8진수: " + Integer.toOctalString(max));
		System.out.println(max + "의 16진수: " + Integer.toHexString(max));
	};

	public static void main(String[] args) {

		// 객체 생성 후 일반 메소드 호출
		System.out.println("//=======일반 메소드=======//");
		ThreeTest4 tt = new ThreeTest4();
		Scanner sc = tt.getScan();
		tt.setScan(sc);

		System.out.println("//=======정적 메소드=======//");
		// 정적 메소드 호출
		Scanner sc2 = getScanS();
		setScanS(sc2);

	}

}