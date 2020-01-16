package J200116;

public class Practice2 {

	public static void main(String[] args) {
		// 99단 출력하기
		/*
		 * for (int j = 3; j < 8; j++) { for (int i = 1; i < 10; i++) {
		 * System.out.println(j+"x"+i+"="+(j*i)); } System.out.println(); // 줄바꿈 }
		 */

		// 1~100 3의 배수만 더하기

		/*
		 * int sum=0; for(int i=1; i <=100; i++) { if(i%3!=0) continue; sum+=i; }
		 */

		// break 예제
		int num;
		int sum = 0;
		for (num = 1;; num++) {
			sum += num;
			if (sum > 100)
				break;
		}
		System.out.println(num);
	}

}
