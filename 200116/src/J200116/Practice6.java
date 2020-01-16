package J200116;

public class Practice6 {
	public static void main(String[] args) {
		// 콘솔창에 피라미드 만들기
		for (int i = 1; i < 5; i++) {
			for (int k = 4; i<k; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
	}
}