package J200116;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = (int) Math.ceil(Math.random() * 100);
		switch (su % 2) {
		case 0:
			System.out.println(su + "��(��) ¦���Դϴ�.");
			break;
		case 1:
			System.out.println(su + "��(��) Ȧ���Դϴ�.");
		}

	}

}
