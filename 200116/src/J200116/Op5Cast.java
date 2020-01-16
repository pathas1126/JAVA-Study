package J200116;

public class Op5Cast {

	public static void main(String[] args) {
		// 자동 형변환
		// 1. 데이터를 그보다 큰 자료형에 저장시 자동 형변환 -> 메모리 낭비가 심함
		short s = 12;
		// 2진수로 저장됨, ......64, 32, 16, 8, 4, 2, 1 | 12의 경우 00000000 00001100
		int i = s; // 00000000 00000000 00000000 00001100 메모리 낭비가 심해짐

		// 2. 계산 중간에 자료형이 자동으로 변환됨,
		// 서로 다른 자료형이 연산될 경우 저장 공간이 더 큰 자료형으로 자동 형변환
		char c = 'A';
		int n = c + 1; // char(2byte)+int(4byte) → int(4byte) + int(4byte)
		System.out.println("n: " + n); // 66

		System.out.println("(char)n:" + (char) n); // B

		int su = (int) 3.5;
		System.out.println("(int)su:" + (int) su);

		int x = 123;
		float y = x + 12.3f; // int + float → float + float → float
		System.out.println("y: " + y);

		byte s2 = 12;
		short s3 = 45;
		int re = s2 + s3; // 산술연산자가 있기 때문에 int로 지정해주어야 함
		System.out.println("re: " + re);

		// Java 이식성 : 산술연산자로 항상 int를 고수함, 
		short re2 = (short) (s2 + s3); //강제 형변환할 때 변수가 수식일 때는 괄호로 묶어줘야 함
		System.out.println("re2: " + re2);
		
		float f = 1.22f;
		float f2 = 4.22f;
		float f3 = (float)(f + f2);
		System.out.println(f3);
		// 5.4399996 왜지? -> 부동소숫점 오차
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
	}

}
