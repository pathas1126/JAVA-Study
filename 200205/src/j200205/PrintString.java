package j200205;

import java.util.Scanner;

// ����� ���� ����, Exception Ŭ���� ���
class OverLength extends Exception {
	// ������, ���� �޼����� ���ڷ� ���޹޾Ƽ� ���� ��ü ����
	OverLength(String message) {
		super(message);
	}
}

public class PrintString {

	// Overlength ���ܸ� �޼ҵ� ȣ��� ó���ϵ��� �̷�
	static void print() throws OverLength {
		// ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);

		// ���ڿ� �Է�
		System.out.println("���ڿ��� �Է����ּ���.");
		String str = sc.nextLine();

		// ���ڿ��� ���̰� 5�� �̻��� �� ���� �߻�
		if (str.length() >= 5)
			throw new OverLength("���ڿ��� 5�� �̻� �Է��� �� �����ϴ�.");
	}

	public static void main(String[] args) {
		// ���� ó��
		try {
			PrintString et = new PrintString();
			print();
			// ���� �߻��� ���� ���� ���
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
