package j200121;

import java.util.Arrays;

/*1. ����ڷκ��� 2���� ���� �Է� �޾� �ִ밪�� ���Ͻÿ�.
2. �ִ��� ���ϴ� �޼��带 �ۼ��Ͻÿ�.*/

public class TwoTest {

	public static void main(String[] args) {

		int a = 45;
		int b = 55;
		int[] c = new int[10];
		for (int i = 0; i < 10; i++) {
			c[i] = i;
		}
	
		System.out.println(Arrays.toString(c));

	TwoTest tt = new TwoTest();
	tt.max(a, b);
	/*
	 * int a = 45; int b = 99;
	 * 
	 * if(a>b) System.out.println("ū ����"+a+"�Դϴ�."); else
	 * System.out.println("ū ����"+b+"�Դϴ�.");
	 */

	// �ִ� ��ȯ Math.max() �޼ҵ� : int maax = Math.max(45, 99);
}

	void max(int a, int b) { // �Ϲ� �޼���: ��ü�� �����ؾ� ȣ�� ������ �޼���
		if (a > b)
			System.out.println("ū ����" + a + "�Դϴ�.");
		else
			System.out.println("ū ����" + b + "�Դϴ�.");
	}

	/*
	 * void arrayMake(int[] c) { for (int i = 0; i < 10; i++) { c[i] = i; } }
	 */

}
