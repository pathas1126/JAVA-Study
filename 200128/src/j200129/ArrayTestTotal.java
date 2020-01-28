package j200129;

public class ArrayTestTotal {

	public static void main(String[] args) {

		int[] b = { 56, 36, 19, 21, 11, 36, 17, 47, 43, 24, 55, 24, 14, 26 }; // 14명

		// 인원수를 담을 변수 선언
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		
		// 각 나이대 별로 countN 변수의 값이 올라가도록 for문 작성
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
		
		// 인원수 출력
		System.out.println("10대 인원수: " + count1 + "명");
		System.out.println("20대 인원수: " + count2 + "명");
		System.out.println("30대 인원수: " + count3 + "명");
		System.out.println("40대 인원수: " + count4 + "명");
		System.out.println("50대 인원수: " + count5 + "명");
	}

}
