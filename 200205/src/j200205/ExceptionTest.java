package j200205;

public class ExceptionTest {

	public static void arr() throws java.lang.ArrayIndexOutOfBoundsException {
		String greetings[] = { "객체 형 변환", "예외 처리", "예외 처리 방법" };
		int i = 0; // 첨자
		while (i < 4) {
			System.out.println(greetings[i]);
			i++;
		}
	}

	public static void main(String[] args) {
		
		
	}

}
