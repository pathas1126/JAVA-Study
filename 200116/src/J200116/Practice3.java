package J200116;

public class Practice3 {

	public static void main(String[] args) {
		// operator 값에 따른 사칙연산 값 구하기
		int num1 = 10;
		int num2 = 2;
		char operator = '*';

		/*
		 * 스위치문 switch(operator) { case '+': num1+=num2; break; case '-': num1-=num2;
		 * break; case '*': num1*=num2; break; case '/': num1/=num2; }
		 */

		// if-else if문
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
