package J200117;

public class ForTest {
	public static void main(String[] args) {
		// for�� ����1 : for�� �ȿ��� �ʱⰪ ���� ����
		for (int i = 1; i <= 5; i++) {
			System.out.println("for�� ����" + i);
		}

		// for�� ����2 : for�� �ۿ��� �ʱⰪ ���� ����
		/*
		 * int k; for (k = 10; k > 5; k--) { System.out.println("Test" + k); }
		 */

		// for�� ����3 : �ʱ���� ������ ����
		int k = 10;
		for (; k > 5; k--) {
			System.out.println("Test" + k);
		}

		// for�� ����4 : ������ ����
		int c = 1;
		for (; c <= 3;) {
			System.out.println("3�� �ݺ�" + c);
			c++;
		}

		// ���� ���� : �������� for�� �ܺο� �����ϸ� ���� ���� �߻�
		/*
		 * c++; for(;c<=3;) { System.out.println("3�� �ݺ�"+c); }
		 */

		// for�� ����5 : ��� ��� ���� -> ���� �ݺ��� ���
		/*
		 * for (;;) { System.out.println("���� �ݺ�"); }
		 */
		
		// for�� ���� 6 : ���ǽ� ����
		int sums = 0;
		for (int i = 0;; i++) {
			sums += i;
			if (sums > 200)
				break;
		}
		System.out.println(sums);
		
		//1~100 �հ�, �� ���ϱ�
		int sum = 0;
		int gap = 1;
		for(int i = 1; i<=100; i++) {
			sum += i;
			gap *= i;
		}
		System.out.println("sum: "+sum);
		System.out.println("gap: "+gap);
	}
}
