package J200116;

public class Practice3 {

	public static void main(String[] args) {
		// operator ���� ���� ��Ģ���� �� ���ϱ�
		int num1 = 10;
		int num2 = 2;
		char operator = '*';

		/*
		 * ����ġ�� switch(operator) { case '+': num1+=num2; break; case '-': num1-=num2;
		 * break; case '*': num1*=num2; break; case '/': num1/=num2; }
		 */

		// if-else if��
		if (operator == '+') {
			num1 += num2;
		} else if (operator == '-') {
			num1 -= num2;
		} else if (operator == '*') {
			num1 *= num2;
		} else if (operator == '/') {
			num1 /= num2;
		}
		System.out.println(num1);
	}

}
