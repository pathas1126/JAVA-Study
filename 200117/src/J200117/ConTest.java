package J200117;

public class ConTest {
	public static void main(String[] args) {
		// continue��
		A:
		for (int a = 0; a < 4; a++) {
			//�̵��ϱ� ���ϴ� for���� �ٷ� ���� ���̺� �ۼ�
			//�ش� ������ ���������� �̵��� 
			for (int b = 0; b < 6; b++) {
				// b�� ¦���� �� continue �ٷ� �Ʒ��� �ڵ带 �������� �ʰ� ���������� �Ѿ
				if (b==2)
					continue A;
				System.out.println("a: " + a + ", b: " + b);
			}
			System.out.println("======");
		}
	}
}
