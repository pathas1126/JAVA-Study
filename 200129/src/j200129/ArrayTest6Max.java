package j200129;

public class ArrayTest6Max {

	public static void main(String[] args) {
		// �迭�� ���� �о���̸鼭 �ִ�, �ּڰ��� �и��ϴ� ����
		int[] score = { 79, 88, 91, 33, 100, 55, 95 }; // 7��

		// �ִ񰪰� �ּڰ��� �迭�� ù ��° ������ �ʱ�ȭ
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				System.out.println("max=> " + max);
			}
			if (min > score[i]) {
				min = score[i];
				System.out.println("min=> " + min);
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("max - min: "+(max - min));
	}

}
