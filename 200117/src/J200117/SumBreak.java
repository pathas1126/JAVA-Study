package J200117;

public class SumBreak {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				if (sum > 200) {
					System.out.println("�ּ����� ��: "+i);
					break;
				}
			}
		}
		System.out.println("�հ�: "+sum);
	}
}
