package j200129;

public class ArrayTestTotal {

	public static void main(String[] args) {

		int[] b = { 56, 36, 19, 21, 11, 36, 17, 47, 43, 24, 55, 24, 14, 26 }; // 14��

		// �ο����� ���� �迭 ����
		int[] count = new int[5];

		// �� ���̴� ���� countN ������ ���� �ö󰡵��� for�� �ۼ�
		// �� ���ǿ� �ش��� ���� count�� �ö󰡱� ������ else-if���� ������� �ʾƵ� ��
		for (int i = 0; i < b.length; i++) {
			if (b[i] >= 10 && b[i] < 20)
				count[0]++;
			if (b[i] >= 20 && b[i] < 30)
				count[1]++;
			if (b[i] >= 30 && b[i] < 40)
				count[2]++;
			if (b[i] >= 40 && b[i] < 50)
				count[3]++;
			if (b[i] >= 50 && b[i] < 60)
				count[4]++;
		}

		// �ο��� ���
		for(int i = 0; i<= count.length; i++) {
			System.out.println(((i+1) *10)+"�� �ο���: "+count[i]+"��");
		}
	}

}
