package j200129;

public class ArrayTestTotal {

	public static void main(String[] args) {

		int[] b = { 56, 36, 19, 21, 11, 36, 17, 47, 43, 24, 55, 24, 14, 26 }; // 14��

		// �ο����� ���� ���� ����
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		
		// �� ���̴� ���� countN ������ ���� �ö󰡵��� for�� �ۼ�
		for (int i = 0; i < b.length; i++) {
			if (b[i] >= 10 && b[i] < 20) {
				count1++;
			} else if (b[i] >= 20 && b[i] < 30) {
				count2++;
			} else if (b[i] >= 30 && b[i] < 40) {
				count3++;
			} else if (b[i] >= 40 && b[i] < 50) {
				count4++;
			} else {
				count5++;
			}
		}
		
		// �ο��� ���
		System.out.println("10�� �ο���: " + count1 + "��");
		System.out.println("20�� �ο���: " + count2 + "��");
		System.out.println("30�� �ο���: " + count3 + "��");
		System.out.println("40�� �ο���: " + count4 + "��");
		System.out.println("50�� �ο���: " + count5 + "��");
	}

}
