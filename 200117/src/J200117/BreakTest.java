package J200117;

public class BreakTest {
	public static void main(String[] args) {
		// 레이블이 없는 Break문
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 6; b++) {
			// b가 2가 되었을 때 해당 루프에서 탈출하도록 함
			if(b==2) break;
				System.out.println("a: " + a + ", b: " + b);
			}
			System.out.println("======");
		}
	}
}
