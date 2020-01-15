package J200115;

public class VarTest {

	public static void main(String[] args) {
		// 자료형 변수명;
		int age;
		age = 23;
		System.out.println("올해 제 나이는 : " + age + "입니다.");

		byte b = 23;
		// 변수 b를 선언하면서 23값을 저장

		short c = 12;
		// byte로도 저장할 수 있는 숫자를 short로 저장하면 메모리 낭비 발생

		int sum = b + c;
		/*
		 * b + c = 35이므로 byte에도 충분히 담길 수 있지만, b + c 에서 산술연산자가 사용되고 있고 java의 기본 연산 단위는
		 * int이기 때문에 int 자료형을 사용해야 함
		 */
		System.out.println("sum의 값: " + sum);

		// 주민등록번호 저장
		long no = 1234567890000L;
		System.out.println("no 값 : " + no);

	}

}
