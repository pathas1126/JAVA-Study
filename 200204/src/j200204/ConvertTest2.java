package j200204;

import java.util.Scanner;

public class ConvertTest2 {

	public static void main(String[] args) {
		// ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);

		// ���ڿ� �Է� while��
		while (true) {
			System.out.println("���ڿ��� �Է� �ϼ���");
			// �Է� ���ڿ�
			String input = sc.nextLine();
			// ��� ���ڿ� �ʱ�ȭ
			String output = "";
			// ���ڿ� ������ ���ڸ� ���� ����
			char ch;
			// ��ҹ��� ���� for ��
			for (int i = 0; i < input.length(); i++) {
				// ch ������ input�� i ��° ���� ����
				ch = input.charAt(i);
				// ������ Ȯ��
				if (!Character.isLetter(ch)) {
					System.out.println("�����ڸ� �Է��� �����մϴ�");
					System.exit(0);
				} else {
					// e �Ǵ� E�� ��� �ִ��� Ȯ��
					if (ch == 'e' || ch == 'E') {
						System.out.println("e�� E�� �Է� �Ұ����մϴ�.");
						System.exit(0);
					} else {
						// ��ҹ��� ����
						if (Character.isLowerCase(ch)) {
							ch = Character.toUpperCase(ch);
							output = output.concat(String.valueOf(ch));
						} else if (Character.isUpperCase(ch)) {
							ch = Character.toLowerCase(ch);
							output = output.concat(String.valueOf(ch));
						}
					}
				}
			}
			// ��� ���
			System.out.println(output);
			// �ٹٲ�
			System.out.println("============");
		}
	}

}
