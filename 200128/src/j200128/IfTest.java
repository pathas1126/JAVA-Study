package j200128;

public class IfTest {
	public static void main(String[] args) {
		// if��
		int su = 30;
		/*
		 * if (su % 2 == 0) { System.out.println(su+"��(��) ¦���Դϴ�."); }
		 */

		if (su % 2 == 1) {
			System.out.println(su + "��(��) Ȧ���Դϴ�.");
		} else {
			System.out.println(su + "��(��) ¦���Դϴ�.");
		}
		
		String su2 = (su % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("�Է¹��� su�� ���� " + su2 + "�Դϴ�.");
		
		int abs = -500;
		abs = (abs < 0)? -abs : abs;
		System.out.println(abs);
		
		abs = Math.abs(-2500);
		System.out.println(abs);
		// java.lang.Math Ŭ������ �⺻���� ���� �޼ҵ尡 ����Ǿ� ����
		
		int max = Math.max(43, 95);
		System.out.println(max);
	}
}