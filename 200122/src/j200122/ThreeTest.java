package j200122;

public class ThreeTest {

	// ���׿����ڸ� �̿��ؼ� ����ϰ� �ۼ�
	int getMaxPrint(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	int getMinPrint(int a, int b, int c) {
		int min;
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		return min;
	}

	void getGap(int max, int min) {
		int gap = max - min;
		System.out.println("�ִ��� " + max + "�Դϴ�.");
		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
		System.out.println("�ִ� - �ּڰ�: " + gap);
	}

	public static void main(String[] args) {
		int a = 111;
		int b = 21;
		int c = 2;

		// class���� �ۼ��� �Ϲݸ޼ҵ�(static X)�� �ݵ�� ��ü ����(4byte) �� ���
		ThreeTest tt = new ThreeTest();
		int max = tt.getMaxPrint(a, b, c);

		int min = tt.getMinPrint(a, b, c);

		tt.getGap(max, min);

	}

}
