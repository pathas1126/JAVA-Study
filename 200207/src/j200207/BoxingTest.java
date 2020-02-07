package j200207;

public class BoxingTest {

	public static void main(String[] args) {
		// 자동 unboxing, Wrapper를 기본 자료형으로 변환
		// int obj = 10;
		Integer obj = new Integer(10);
		int sum = obj.intValue() + 20; // 10(객체형) + 20(자료형) => 기본 자료형 + 기본 자료형
		System.out.println("sum: " + sum);

		// 자동 boxing, 기본 자료형을 Wrapper로 변환
		Double d = new Double(123.45);
		printDouble(d);
		printDouble(123.22);

		Integer num1 = new Integer(123);
		int num2 = 200;
		int sum2 = num1 + num2; // 언박싱: num1.intValue()로 변환
		Integer num3 = num2; // 오토박싱: Integer.valueOf(num2) 로 변환
	}

	// Double형 값의 소수점을 출력하기 위해 문자열로 출력하는 메소드
	public static void printDouble(Double obj2) {
		System.out.println(obj2.toString());
	}
}
