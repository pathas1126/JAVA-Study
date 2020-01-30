package j200130.abc;

public class PrintTest {
	// char 출력 메소드, public으로 설정해야 외부 패키지에서 사용 가능
	public void charPrint(int n, char ch) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}
	}

	// char 출력 정적 메소드, 정적 메소드 역시 public으로 설정해야 외부 패키지에서 사용 가능
	public static void charPrintStatic(int n, char ch) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}
	}
}
