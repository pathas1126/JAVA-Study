package j200129;

public class DoubleArray {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]); // ���� �ּҰ��� ��µ� -> ������ ���� �ּҰ��� �˷���
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array2[" + i + "][" + j + "]: " + array[i][j]);
			}
		}

		// 2���� �迭 Ȯ�� for��
		/*
		 * ����) for(1���� �迭 �ڷ��� �迭��[]:2���� �迭��) for(1���� �迭 �ڷ��� ����� ������: 1���� �迭��)
		 */
		for (int tmp[] : array) { // 2���� �迭 ���� ������ ���� �ӽ÷� 1���� �迭 tmp[]�� �Ҵ�
			for (int val : tmp) { // 1���� �迭 tmp[]�� ������ ��Ҹ� ���� val�� �Ҵ�
				System.out.print(val + "\t");
			}
			System.out.println();
		}

	}

}
