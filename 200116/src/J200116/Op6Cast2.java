package J200116;

public class Op6Cast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20, num2 = 30;
		// ����) printf("��¾��",��´����,,,) : %d(������), %c(����), %s(���ڿ�), %f(�Ҽ���)
		System.out.printf("ù ��° ����=%d, �� ��° ����=%d", num1, num2);
		System.out.println(); // �ٹٲ�
		System.out.print('\n'); // �ٹٲ� Ư����ȣ ���

		// ����ȯ
		char ch = 'A';
		System.out.println("ch: " + ch); // ���ο� ����� ASCII ���� ��ȯ�ؼ� ���
		System.out.printf("���� %c�� ASCII �� : %d\n", ch, (int) ch);
		// printf�� %d�� ���ڸ� �״�� ����ϱ� ������ ch�� int�� ����ȯ ���־�� ��
		int ch2 = ch;
		System.out.println("ch2: " + ch2);

		// Ȱ��
		int java = 90, jsp = 85, oracle = 70;
		int sum = java + jsp + oracle;
		System.out.printf("sum=%d�Դϴ�.\n", sum);
		
		int avg=sum/3;
		double avg2 = sum/3;
		System.out.println("avg: "+avg+", avg2: "+avg2); // avg2: 81.0
		
		double avg3 = (double)sum/3;
		System.out.println("avg3: "+avg3);
		// ���� %f, %.�Ҽ����ڸ���f ex) %.2f
		System.out.printf("avg3: %.2f", avg3);
	}

}
