package J200117;

public class ConTest {
	public static void main(String[] args) {
		// continue문
		A:
		for (int a = 0; a < 4; a++) {
			//이동하길 원하는 for문의 바로 위에 레이블 작성
			//해당 포문의 증감식으로 이동함 
			for (int b = 0; b < 6; b++) {
				// b가 짝수일 때 continue 바로 아래의 코드를 실행하지 않고 증감식으로 넘어감
				if (b==2)
					continue A;
				System.out.println("a: " + a + ", b: " + b);
			}
			System.out.println("======");
		}
	}
}
