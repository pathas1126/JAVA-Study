package j200129;

public class ArrayTestTotal {

	public static void main(String[] args) {

		int[] b = { 56, 36, 19, 21, 11, 36, 17, 47, 43, 24, 55, 24, 14, 26 }; // 14명

		// 인원수를 담을 배열 선언
		int[] count = new int[5];

		// 각 나이대 별로 countN 변수의 값이 올라가도록 for문 작성
		// 각 조건에 해당할 때만 count가 올라가기 때문에 else-if문을 사용하지 않아도 됨
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

		// 인원수 출력
		for(int i = 0; i<= count.length; i++) {
			System.out.println(((i+1) *10)+"대 인원수: "+count[i]+"명");
		}
	}

}
