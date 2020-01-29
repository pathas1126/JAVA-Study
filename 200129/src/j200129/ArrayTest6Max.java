package j200129;

public class ArrayTest6Max {

	public static void main(String[] args) {
		// 배열의 값을 읽어들이면서 최댓값, 최솟값을 분리하는 로직
		int[] score = { 79, 88, 91, 33, 100, 55, 95 }; // 7명

		// 최댓값과 최솟값을 배열의 첫 번째 값으로 초기화
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
