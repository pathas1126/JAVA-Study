package J200116;

public class Practice4 {

	public static void main(String[] args) {
		// ¦���ܸ� ����ϴ� 99��
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1)
				continue;
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}

}
