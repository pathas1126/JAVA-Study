package J200116;

public class Practice2 {

	public static void main(String[] args) {
		// 99�� ����ϱ�
		/*
		 * for (int j = 3; j < 8; j++) { for (int i = 1; i < 10; i++) {
		 * System.out.println(j+"x"+i+"="+(j*i)); } System.out.println(); // �ٹٲ� }
		 */

		// 1~100 3�� ����� ���ϱ�

		/*
		 * int sum=0; for(int i=1; i <=100; i++) { if(i%3!=0) continue; sum+=i; }
		 */

		// break ����
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
