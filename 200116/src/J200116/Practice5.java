package J200116;

public class Practice5 {

	public static void main(String[] args) {
		// �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ���
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
