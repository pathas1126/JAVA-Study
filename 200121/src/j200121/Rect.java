package j200121;

public class Rect {
	int x;
	int y;

	// �Ű����� X, ��ȯ�� X
	void square1() {
		System.out.println("�簢��1 ����: " + (x * y));
	}

	// �Ű����� O, ��ȯ�� X
	void square2(int a, int b) {
		System.out.println("�簢��2 ����: " + (a * b));
	}

	// �Ű����� O, ��ȯ�� O
	int square3(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		Rect rect = new Rect();
		rect.x = 10;
		rect.y = 20;
		rect.square1();
		rect.square2(15, 15);

		int square3 = rect.square3(11, 12);
		System.out.println("�簢��3 ����: " + square3);
		/*
		 * ���� �� ���� �ڵ带 ������ ���� ǥ���� �� ����
		 * System.out.println("�簢�� ����: " + rect.square3(11,12)); 
		 */
	}
}
