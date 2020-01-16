package J200116;

public class Practice {

	public static void main(String[] args) {

		int sum = 0;

		/*
		 * while(num <= 10) { sum += num; num++; }
		 */

		/*
		 * do { num = 99; sum += num; num++; }while(num<=10);
		 */

		for (int num = 1; num <= 10; num++) {
			System.out.println("안녕하세요, " + num + "입니다.");
		}
		System.out.println(sum);
	}

}
