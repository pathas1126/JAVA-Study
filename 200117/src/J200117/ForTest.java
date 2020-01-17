package J200117;

public class ForTest {
	public static void main(String[] args) {
		// for문 유형1 : for문 안에서 초기값 변수 선언
		for (int i = 1; i <= 5; i++) {
			System.out.println("for문 연습" + i);
		}

		// for문 유형2 : for문 밖에서 초기값 변수 선언
		/*
		 * int k; for (k = 10; k > 5; k--) { System.out.println("Test" + k); }
		 */

		// for문 유형3 : 초기식이 생략된 유형
		int k = 10;
		for (; k > 5; k--) {
			System.out.println("Test" + k);
		}

		// for문 유형4 : 증감식 생략
		int c = 1;
		for (; c <= 3;) {
			System.out.println("3번 반복" + c);
			c++;
		}

		// 무한 루프 : 증감식을 for문 외부에 선언하면 무한 루프 발생
		/*
		 * c++; for(;c<=3;) { System.out.println("3번 반복"+c); }
		 */

		// for문 유형5 : 요소 모두 생략 -> 무한 반복시 사용
		/*
		 * for (;;) { System.out.println("무한 반복"); }
		 */
		
		// for문 유형 6 : 조건식 생략
		int sums = 0;
		for (int i = 0;; i++) {
			sums += i;
			if (sums > 200)
				break;
		}
		System.out.println(sums);
		
		//1~100 합계, 곱 구하기
		int sum = 0;
		int gap = 1;
		for(int i = 1; i<=100; i++) {
			sum += i;
			gap *= i;
		}
		System.out.println("sum: "+sum);
		System.out.println("gap: "+gap);
	}
}
