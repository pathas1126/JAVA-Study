package j200117;

public class WhileTest2 {
	int start = 1;
	int end = 5;

	// �Ű����� X, ��ȯ�� X, ��� ���� ���
	public void whilePrint() {
		if (start <= end) {
			while (start <= end) {
				System.out.println("while ���" + start);
				start++;
			}
			System.out.println("��� ����");
		} else {
			System.out.println("start���� end������ Ŭ �� �����ϴ�!");
		}
	}

	// �Ű����� O, ��ȯ��X, ��� ���� ���X
	// start�� ��� ������ ��ġ�� �ʱ� ������ this ��� X
	public void whilePrint(int start, int end) {
		if (start <= end) {
			while (start <= end) {
				System.out.println("while ���" + start);
				start++;
			}
			System.out.println("��� ����");
		} else {
			System.out.println("start���� end������ Ŭ �� �����ϴ�!");
		}
	}

	// �Ű����� O, ��ȯ�� O
	public double whilePrint(double start, double end) {
		if (start <= end) {
			return (end - start) + 1;
		} else {
			System.out.println("start���� end������ Ŭ �� �����ϴ�!");
			return 0;
		}
	}

	public static void main(String[] args) {

		// wt2 ��ü ����
		WhileTest2 wt2 = new WhileTest2();
		// �Ű����� X, ��ȯ�� X �޼ҵ� ����
		wt2.whilePrint();
		// �Ű����� O, ��ȯ�� X �޼ҵ� ����
		wt2.whilePrint(2, 4);

		// �Ű����� O, ��ȯ�� O �޼ҵ� ����
		// ��ȯ���� �ݿø� �� int������ ������ ����
		int i = (int) Math.round(wt2.whilePrint(25.22, 28.65));
		// start, end�� ���̸�ŭ ���
		for (; i > 0; i--) {
			// ������ int i �� ����Ǿ��� ������ �ʱ�� ����
			System.out.println("while���" + i);
		}
		System.out.println("��� ����");
	}

}