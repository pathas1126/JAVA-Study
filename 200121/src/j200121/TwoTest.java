package j200121;

import java.util.Arrays;

/*1. 사용자로부터 2개의 값을 입력 받아 최대값을 구하시오.
2. 최댓값을 구하는 메서드를 작성하시오.*/

public class TwoTest {

	public static void main(String[] args) {

		int a = 45;
		int b = 55;
		int[] c = new int[10];
		for (int i = 0; i < 10; i++) {
			c[i] = i;
		}
	
		System.out.println(Arrays.toString(c));

	TwoTest tt = new TwoTest();
	tt.max(a, b);
	/*
	 * int a = 45; int b = 99;
	 * 
	 * if(a>b) System.out.println("큰 값은"+a+"입니다."); else
	 * System.out.println("큰 값은"+b+"입니다.");
	 */

	// 최댓값 반환 Math.max() 메소드 : int maax = Math.max(45, 99);
}

	void max(int a, int b) { // 일반 메서드: 객체를 생성해야 호출 가능한 메서드
		if (a > b)
			System.out.println("큰 값은" + a + "입니다.");
		else
			System.out.println("큰 값은" + b + "입니다.");
	}

	/*
	 * void arrayMake(int[] c) { for (int i = 0; i < 10; i++) { c[i] = i; } }
	 */

}
