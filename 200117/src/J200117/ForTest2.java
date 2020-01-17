package J200117;

public class ForTest2 {
	public static void main(String[] args) {
		// 중첩 for문 or 이중 for문
		for (int a = 0; a < 5; a++) {
			// Outer For
			for (int b = 0; b < 6; b++) {
				System.out.println("a: " + a + ", b: " + b);
			}
			// Inner For
			System.out.println("======");
		}
	}
}
