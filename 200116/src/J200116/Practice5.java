package J200116;

public class Practice5 {

	public static void main(String[] args) {
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i < j)
					break;
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}

	}

}
