package J200116;

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
	}
}
