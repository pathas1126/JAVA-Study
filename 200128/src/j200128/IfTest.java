package j200128;

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
		
		int abs = -500;
		abs = (abs < 0)? -abs : abs;
		System.out.println(abs);
		
		abs = Math.abs(-2500);
		System.out.println(abs);
		// java.lang.Math 클래스에 기본적인 수학 메소드가 저장되어 있음
		
		int max = Math.max(43, 95);
		System.out.println(max);
	}
}