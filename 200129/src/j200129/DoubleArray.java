package j200129;

public class DoubleArray {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]); // 행의 주소값이 출력됨 -> 각각의 열의 주소값을 알려줌
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array2[" + i + "][" + j + "]: " + array[i][j]);
			}
		}

		// 2차원 배열 확장 for문
		/*
		 * 형식) for(1차원 배열 자료형 배열명[]:2차원 배열명) for(1차원 배열 자료형 출력할 변수명: 1차원 배열명)
		 */
		for (int tmp[] : array) { // 2차원 배열 내의 각강의 행을 임시로 1차원 배열 tmp[]에 할당
			for (int val : tmp) { // 1차원 배열 tmp[]의 각각의 요소를 변수 val에 할당
				System.out.print(val + "\t");
			}
			System.out.println();
		}

	}

}
