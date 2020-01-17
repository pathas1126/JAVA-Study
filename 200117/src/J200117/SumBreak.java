package J200117;

public class SumBreak {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				if (sum > 200) {
					System.out.println("최소한의 값: "+i);
					break;
				}
			}
		}
		System.out.println("합계: "+sum);
	}
}
