package j200129;

// Scanner import
import java.util.Scanner;

public class RepeatChar {

	// ���� �޼ҵ� �ۼ�
	static void charPrint(int iterInt, String iterStr) {
		for (int i = 0; i < iterInt; i++) {
			System.out.print(iterStr);
		}
	}

	// �Ϲ� �޼ҵ� �ۼ�
	void charPrintInstance(int iterInt, String iterStr) {
		for (int i = 0; i < iterInt; i++) {
			System.out.print(iterStr);
		}
	}

	public static void main(String[] args) {

		// Scanner ��ü ����
		Scanner sc = new Scanner(System.in);

		// sc��ü�� ���ڸ� �Է¹޾Ƽ� iterStr ������ ����
		System.out.println("�ݺ��� ���ڸ� �Է��ϼ���");
		String iterStr = sc.next();

		// sc��ü�� ������ �Է¹޾Ƽ� iterInt ������ ����
		System.out.println("�ݺ��� Ƚ���� �Է��ϼ���");
		int iterInt = sc.nextInt();

		// ���� �޼ҵ�, �ٷ� ���
		RepeatChar.charPrint(iterInt, iterStr);

		// �� �ٲ�
		System.out.println();
		System.out.println("==============");

		// �Ϲ� �޼ҵ�, ��ü ���� �� ���
		System.out.println("�ݺ��� ���ڸ� �Է��ϼ���");
		iterStr = sc.next();
		System.out.println("�ݺ��� Ƚ���� �Է��ϼ���");
		iterInt = sc.nextInt();
		RepeatChar rc = new RepeatChar();
		rc.charPrintInstance(iterInt, iterStr);

	}

}
