package J200117;

public class WhileTest {
	public static void main(String[] args) {
		// while ���� ����

		// 5ȸ �ݺ� while��
		int i = 11; // �ݺ� Ƚ�� ����
		while (i <= 5) {
			System.out.println("while ���� ����" + i);
			i++;
			// i���� 1�� �������Ѽ� while���� �����ų ������ ����
		}
		System.out.println("while�� ����");

		// ���� Loop
		/*
		 * int j = 1; while (j < 5) { System.out.println("�������� ������"); }
		 */
		// j�� �׻� 5���� �۱� ������ "�������� ������"�� ��� ��µ�

		// do~while��
		do {
			System.out.println("do while ����");
		} while (i <= 5);
		System.out.println("do while ����");
	}
}
