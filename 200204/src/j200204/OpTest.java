package j200204;

import java.util.Scanner;

public class OpTest {

	public static void main(String[] args) {
		// ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);
		// ù ��° ���� �Է�
		System.out.println("ù ��° ���� �Է�");
		String firstStr = sc.nextLine();
		// String���� ������ ������ int������ ��ȯ
		int first = Integer.parseInt(firstStr);

		// ������ �Է�
		System.out.println("������ ����: +, -, *, /");
		String oper = sc.nextLine();

		// �� ��° ���� �Է�
		System.out.println("�� ��° ���� �Է�");
		String secondStr = sc.nextLine();
		// int ������ ��ȯ
		int second = Integer.parseInt(secondStr);
		// ��� ���� ����
		int result = 0;

		// ����ġ ������ �����ڿ� ���� ��� ó��
		switch (oper) {
		case "+":
			result = first + second;
			break;
		case "-":
			result = first - second;
			break;
		case "*":
			result = first * second;
			break;
		case "/":
			result = first / second;
		}

		// ��� ���
		System.out.println("���: " + result);

	}
	// next(), nextLine() ��� ����� �����ϰ� ���ͼ� nextLine()���� ��
}
