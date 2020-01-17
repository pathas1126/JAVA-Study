package J200117;

public class Star {

	public static void main(String[] args) {
		// 이중 for문 연습, 규칙성(특)을 발견하는 것이 중요함

		// 5x5 정사각형
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 왼쪽 하단 각이 90도인 삼각형
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 왼쪽 상단 각이 90도인 삼각형
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--){
				// (int j = 1; j <= 6 - i; j++) 
				System.out.print("*");
			}
			System.out.println();
		}

		// 5x5정사각형의 좌우변 출력
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j > 1 && j < 5) {
					System.out.print("  ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
