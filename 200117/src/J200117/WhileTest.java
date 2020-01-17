package J200117;

public class WhileTest {
	public static void main(String[] args) {
		// while 구문 연습

		// 5회 반복 while문
		int i = 11; // 반복 횟수 저장
		while (i <= 5) {
			System.out.println("while 구문 연습" + i);
			i++;
			// i값을 1씩 증가시켜서 while문을 종료시킬 조건을 만듬
		}
		System.out.println("while문 종료");

		// 무한 Loop
		/*
		 * int j = 1; while (j < 5) { System.out.println("실행하지 마세요"); }
		 */
		// j가 항상 5보다 작기 때문에 "실행하지 마세요"가 계속 출력됨

		// do~while문
		do {
			System.out.println("do while 실행");
		} while (i <= 5);
		System.out.println("do while 종료");
	}
}
