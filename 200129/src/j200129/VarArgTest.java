package j200129;

public class VarArgTest {

	// 메소드 오버로딩, 하나의 클래스에서 비슷한 기능을 가진 메서드가 여러개 있는 경우 사용
	// 오버로딩 기법 => 배열 + 확장 for문 + 오버로딩, 매개변수의 자료형은 반드시 같고 개수만 다를 때 사용

	/*
	 * public void stringPrint(String a) { System.out.println("a: "+a); } public
	 * void stringPrint(String a, String b) { System.out.println("a: "+a+",b: "+b);
	 * } public void stringPrint(String a, String b, String c) {
	 * System.out.println("a: "+a+",b: "+b+", c:"+c); }
	 */

	// 고정 배열을 매개변수로 받는 메소드
	public void stringPrint(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	// 가변배열로 메소드 작성, 자료형은 반드시 같아야 함
	// 형식) 메소드 작성방법과 동일(자료형 ... 배열명), '...' : 배열이 가변배열임을 뜻함
	public void print(String... names) {
		for (String su : names) {
			System.out.print(su + ", ");
		}
		System.out.println();
	}
	/*
	 * String names[] = {"홍길동"} String names[] = {"홍길동", "이순신"} ...
	 */

	public static void main(String[] args) {
		VarArgTest vat = new VarArgTest();
		String str[] = { "Banana", "Orange", "Apple", "Grape" };
		vat.stringPrint(str);

		vat.print("홍길동");
		vat.print("홍길동", "이순신");
		vat.print("홍길동", "이순신", "유성룡");
		vat.print("홍길동", "이순신", "유성룡", "강감찬");
		vat.print("홍길동", "이순신", "유성룡", "강감찬", "이도");

	}

}
