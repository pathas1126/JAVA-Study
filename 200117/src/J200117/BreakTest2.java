package J200117;

public class BreakTest2 {
	public static void main(String[] args) {
		// ���̺��� �ִ� Break��
		
		A://����) ���̺��:
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 6; b++) {
			if(b==2) break A;
				System.out.println("a: " + a + ", b: " + b);
			}
			System.out.println("======");
		}
	}
}
