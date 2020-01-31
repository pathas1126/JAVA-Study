package j200131;

import java.util.Scanner;

public class ThreeTest4 {

	// ==================�Ϲ� �޼ҵ�===============//
	// �ִ� �Ϲ� �޼ҵ�
	public int getMax(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// Scanner ��ü�� ������ �Ϲ� getter
	public Scanner getScan() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	// Scanner ��ü�� �Ѱ��ִ� �Ϲ� setter
	public void setScan(Scanner sc) {
		// ���� �ʱ�ȭ
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int c = sc.nextInt();

		int max = getMax(a, b, c);

		print(max);
	}

	// ��� �Ϲ� �޼ҵ�
	public void print(int max) {
		System.out.println("�ִ�: " + max);
		System.out.println(max + "�� 2����: " + Integer.toBinaryString(max));
		System.out.println(max + "�� 8����: " + Integer.toOctalString(max));
		System.out.println(max + "�� 16����: " + Integer.toHexString(max));
	};

	// ==================���� �޼ҵ�===============//
	// ���� �޼ҵ�� �ν��Ͻ� �޼ҵ忡 ������ �� ���� ������ �����޼ҵ嵵 ���� �ۼ��ؾ� ��
	// �ִ� ���� �޼ҵ�
	public static int getMaxS(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	// Scanner ��ü�� ������ ���� getter
	public static Scanner getScanS() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	// Scanner ��ü�� �Ѱ��ִ� ���� setter
	public static void setScanS(Scanner sc) {
		// ���� �ʱ�ȭ
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int c = sc.nextInt();

		int max = getMaxS(a, b, c);

		printS(max);
	}

	// ��� ���� �޼ҵ�
	public static void printS(int max) {
		System.out.println("�ִ�: " + max);
		System.out.println(max + "�� 2����: " + Integer.toBinaryString(max));
		System.out.println(max + "�� 8����: " + Integer.toOctalString(max));
		System.out.println(max + "�� 16����: " + Integer.toHexString(max));
	};

	public static void main(String[] args) {

		// ��ü ���� �� �Ϲ� �޼ҵ� ȣ��
		System.out.println("//=======�Ϲ� �޼ҵ�=======//");
		ThreeTest4 tt = new ThreeTest4();
		Scanner sc = tt.getScan();
		tt.setScan(sc);

		System.out.println("//=======���� �޼ҵ�=======//");
		// ���� �޼ҵ� ȣ��
		Scanner sc2 = getScanS();
		setScanS(sc2);

	}

}