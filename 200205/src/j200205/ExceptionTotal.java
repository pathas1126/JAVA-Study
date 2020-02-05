package j200205;

public class ExceptionTotal {

	public static void main(String[] args) {
		System.out.println("매개변수를 전달 받아서 처리");
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a: " + a + ", b:" + b);
			System.out.println("a를 b로 나눈 몫: " + (a / b));
		} catch (ArithmeticException e) { // 수식오류 9/0
			System.out.println(e.getMessage());
			System.out.println("9를 0으로 나눌 수 없습니다.");
		} catch (IndexOutOfBoundsException e) { // 배열 첨자 문제(하나만 입력한 경우)
			System.out.println(e);
			System.out.println("2개의 인자를 입력하세요!");
		} catch (NumberFormatException e) { // 숫자 변환 실패 예외 "9" -> 9, "a" -> (X)
			System.out.println(e.toString());
			System.out.println("입력은 반드시 숫자여야 합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("에러 발생과 상관 없이 반드시 실행");
		}
	}

}
