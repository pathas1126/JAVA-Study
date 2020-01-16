package J200116;

public class Op1 {

	public static void main(String[] args) {
//		// 산술, 증감연산자
//		int a=3, b=4;
//		int c = a + b; // 숫자가 작지만 int를 사용하는 이유는 기본 연산 자료형이 int이기 때문
//		System.out.println(c);
//		double d = 3*3*3.141592;
//		System.out.println(d);
//		// double형도 산술연산이 가능함
		
		int a=4;
		int b=a++;
		int c= ++a;
		System.out.println("a값: "+a+", b값: "+b+", c값: "+c);
	}

}
