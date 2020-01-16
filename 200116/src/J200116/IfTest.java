package J200116;

public class IfTest {
	public static void main(String[] args) {
		// if문
		int su = 30;
		/*
		 * if (su % 2 == 0) { System.out.println(su+"은(는) 짝수입니다."); }
		 */

		if (su % 2 == 1) {
			System.out.println(su + "은(는) 홀수입니다.");
		} else {
			System.out.println(su + "은(는) 짝수입니다.");
		}

		String su2 = (su % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력받은 su의 값은 " + su2 + "입니다.");
	}
}
