package J200117;

public class Star {

	public static void main(String[] args) {
		// ���� for�� ����, ��Ģ��(Ư)�� �߰��ϴ� ���� �߿���

		// 5x5 ���簢��
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���� �ϴ� ���� 90���� �ﰢ��
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���� ��� ���� 90���� �ﰢ��
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--){
				// (int j = 1; j <= 6 - i; j++) 
				System.out.print("*");
			}
			System.out.println();
		}

		// 5x5���簢���� �¿캯 ���
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j > 1 && j < 5) {
					System.out.print("  ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
