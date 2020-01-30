package j200130;

import java.util.Scanner;

public class ThreeTest2 {

	// �ִ� �Ϲ� �޼ҵ�
	public int getMax(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// �ִ� ���� �޼ҵ�
	public static int getMaxS(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// �ִ� ���� ��� �Ϲ� �޼ҵ�
	public void printMax(int max) {
		System.out.println(max + "�� 2����: " + Integer.toBinaryString(max));
		System.out.println(max + "�� 8����: " + Integer.toOctalString(max));
		System.out.println(max + "�� 16����: " + Integer.toHexString(max));
	}

	// �ִ� ���� ��� ���� �޼ҵ�
	public static void printMaxS(int max) {
		System.out.println(max + "�� 2����: " + Integer.toBinaryString(max));
		System.out.println(max + "�� 8����: " + Integer.toOctalString(max));
		System.out.println(max + "�� 16����: " + Integer.toHexString(max));
	}

	public static void main(String[] args) {
		// ========main�� �ۼ�=======//

		// ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);

		// int a, b, c ������ �� ���� �Է�
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int c = sc.nextInt();

		// �ִ� ���� max ���� �� �ִ� ����
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;

		// ���
		System.out.println("�ִ�: " + max);
		System.out.println(max + "�� 2����: " + Integer.toBinaryString(max));
		System.out.println(max + "�� 8����: " + Integer.toOctalString(max));
		System.out.println(max + "�� 16����: " + Integer.toHexString(max));

		// ThreeTest2 ��ü ���� �� �Ϲ� �޼ҵ� ���
		ThreeTest2 tt2 = new ThreeTest2();
		System.out.println("�ִ�: " + tt2.getMax(a, b, c));
		tt2.printMax(max);

		// ThreeTest2 ���� �޼ҵ� ���
		System.out.println("�ִ�: " + ThreeTest2.getMaxS(a, b, c));
		ThreeTest2.printMaxS(max);

	}

}