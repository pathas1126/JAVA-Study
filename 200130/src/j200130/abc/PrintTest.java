package j200130.abc;

public class PrintTest {
	// char ��� �޼ҵ�, public���� �����ؾ� �ܺ� ��Ű������ ��� ����
	public void charPrint(int n, char ch) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}
	}

	// char ��� ���� �޼ҵ�, ���� �޼ҵ� ���� public���� �����ؾ� �ܺ� ��Ű������ ��� ����
	public static void charPrintStatic(int n, char ch) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}
	}
}
