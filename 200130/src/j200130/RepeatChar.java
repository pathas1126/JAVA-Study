package j200130;

// import: �ܺ� ��Ű���� �����ϴ� Ŭ������ ������ �� ���
import java.util.Scanner;
import j200130.abc.PrintTest;

public class RepeatChar {


	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		
		// ���� �Է�
		System.out.println("���ڸ� �Է��Ͻÿ�");
		// ���ڿ��� �ܼ�â���κ��� �Է¹��� ��, ���ڿ� �� ���� ���ʿ��� ���� ���� 
		String str = sc.nextLine().trim();
		// ���ڿ��� 6��° ���ڸ� char������ ��ȯ�ؼ� ch ������ ����
		char ch = str.charAt(6);
		
		// ���� �Է�
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int n = sc.nextInt();
		
		// PrintTest ��ü ����
		PrintTest pt = new PrintTest();
		// PrintTest �ν��Ͻ� �޼ҵ� ȣ��
		pt.charPrint(n, ch);
		
		// �ٹٲ�
		System.out.println();
		
		// PrintTest ���� �޼ҵ� ȣ��
		PrintTest.charPrintStatic(n, ch);
	}

}
