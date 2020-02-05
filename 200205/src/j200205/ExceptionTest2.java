package j200205;

public class ExceptionTest2 {

	public void go() throws ArrayIndexOutOfBoundsException {
		String greetings[] = { "객체 형 변환", "예외 처리", "예외 처리 방법" };
		int i = 0; // 첨자
		while (i < 4) {
			System.out.println(greetings[i]);
			i++;
		}
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//		String greetings[] = { "객체 형 변환", "예외 처리", "예외 처리 방법" };
//		int i = 0;	// 첨자
//		while(i<4) {
//			System.out.println(greetings[i]);
//			i++;
//		}
		try {
			ExceptionTest2 et = new ExceptionTest2();
			et.go();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("예외 처리 종료");
	}

	// throws : 예외 처리 미루기

}
