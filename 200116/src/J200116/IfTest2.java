package J200116;

public class IfTest2 {

	public static void main(String[] args) {
		// ��ø If��
		// 1~100������ ���� �Է¹޴´ٴ� ���� �Ͽ� Ȧ��, ¦�� �Ǻ�
		// 1~100 ������ ���� �ʴ� ���� -> "���ڴ� 1~100 �ȿ��� �Է��� �ּ���!!"
		int su = 111;
		if ((1 <= su) && (su <= 100)) {
			if (su % 2 == 1) {
				System.out.println(su + "��(��) Ȧ���Դϴ�.");
			} else {
				System.out.println(su + "��(��) ¦���Դϴ�.");
			}
		} else {
			System.out.println("���ڴ� 1~100 �ȿ��� �Է��� �ּ���!!");
		}
	}
}
