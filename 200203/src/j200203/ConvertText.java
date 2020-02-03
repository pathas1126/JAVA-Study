package j200203;

import java.util.Scanner;

// �Է¹��� ���ڿ� ��ҹ��� �ٲٱ�

public class ConvertText {

	public static void main(String[] args) {
		// A~Z: 65~ 90, a~z: 97~ 122

		// ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);

		// ���ڿ� �Է� �ޱ�
		System.out.println("���ڿ��� �Է��Ͻÿ�");
		String input = sc.nextLine();

		// �Է¹��� ���ڿ� ������ ���ڰ� ��� ���� �ʱ�ȭ
		char ch = 'a';

		// ��� ���ڿ� ���� �ʱ�ȭ
		String output = "";

		// ���ڿ� ������ ���ڿ� ���ؼ� ��ҹ��ڸ� ����
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else if (Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			output = output.concat(String.valueOf(ch));
		}
		System.out.println(output);
	}

}
