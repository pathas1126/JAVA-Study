package J200117;

public class ForTest2 {
	public static void main(String[] args) {
		// ��ø for�� or ���� for��
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
