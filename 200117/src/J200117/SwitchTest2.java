package J200117;

public class SwitchTest2 {
	public static void main(String[] args) {
		int su=15;
		//1~10 ¦�� Ȧ�� �Ǻ��ϱ�
		switch(su) {
		case 2: case 4:
		case 6: case 8:
		case 10:
			System.out.println("su�� ¦���Դϴ�.");
			break;
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("su�� Ȧ���Դϴ�.");
			break;
		default : System.out.println("���ڴ� 1~10 ���� ������ �������ּ���!!");
		}
	}
}
