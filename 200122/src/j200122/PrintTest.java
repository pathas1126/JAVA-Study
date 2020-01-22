package j200122;

public class PrintTest {

	// Constructor Overload + Method Overloading
	PrintTest() {
	};

	PrintTest(char x) {
		print(x);
	};

	/*
	 * �ڱ� Ŭ���� ���ο����� �ڱ� ��ü���� ����� �� ����, �ٸ� Ŭ������ ��ü���� ��ü ���� �� ��� ����
	 */
	PrintTest(int y) {
		print(y);
	};

	PrintTest(boolean z) {
		print(z);
	};

	// Method Overloading, �Ű����� O, ��ȯ�� X
	void print(char c) {
		System.out.println("�Է¹��� ����: " + c);
	}

	void print(int i) {
		System.out.println("�Է¹��� ����: " + i);
	}

	void print(boolean b) {
		System.out.println("�Է¹��� ����: " + b);
	}

	public static void main(String[] args) {
		PrintTest pt1 = new PrintTest('v'); // �Է¹��� ����: v
		PrintTest pt2 = new PrintTest(23); // �Է¹��� ����: 23
		PrintTest pt3 = new PrintTest(23 > 11); // �Է¹��� ����: true

	}

}
