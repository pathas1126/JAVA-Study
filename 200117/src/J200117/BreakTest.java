package J200117;

public class BreakTest {
	public static void main(String[] args) {
		// ���̺��� ���� Break��
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 6; b++) {
			// b�� 2�� �Ǿ��� �� �ش� �������� Ż���ϵ��� ��
			if(b==2) break;
				System.out.println("a: " + a + ", b: " + b);
			}
			System.out.println("======");
		}
	}
}
