package j200205;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// �� �Է�
			System.out.println("����� ���� �Է��ϼ���");
			// ���ڿ��� ���� �Է��� ����
			String input = sc.next();
			// ���ڿ��� Q �Ǵ� q��� ���α׷� ����
			if (input.contentEquals("Q") || input.contentEquals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				// �ƴ� ��쿡 ������ ���
			} else {
				// ���ڿ��� int������ ��ȯ
				int dan = Integer.parseInt(input);
				if (dan > 9 || dan < 2) {
					System.out.println("���ڴ� 2~9������ �Է����ּ���.");
				} else {
					// �� ���
					System.out.println(dan + "�ܡ�");
					for (int i = 1; i <= 9; i++) {
						System.out.println(dan + " x " + i + " = " + (dan * i));
					}
				}

			}
		}

	}

}
