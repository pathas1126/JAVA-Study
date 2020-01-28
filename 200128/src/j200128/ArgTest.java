package j200128;

public class ArgTest {

	public static void main(String[] args) {
		// 일반적인 배열
		// 형식) 자료형 배열명[] = new 자료형[개수];
		// 일반 변수는 반드시 값을 초기화해야 하지만, 배열은 자동으로 초기값이 설정됨
		int[] suArray = new int[4];
		suArray[0] = 1;
		suArray[1] = 2;
		suArray[2] = 3;
		System.out.println(suArray[0]);
		System.out.println(suArray[1]);
		System.out.println(suArray[2]);
		System.out.println(suArray[3]);
		System.out.println(suArray);

		// 배열을 생성하자마자 바로 값 초기화
		// 자료형[] 배열명 = {값1, 값2, 값3,,,,}
		int[] c = { 10, 20, 30, 40, 50, 60 };
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		int[] arrayTest = new int[10];
		for (int i = 0; i < 10; i++) {
			arrayTest[i] = (i + 1) * 10;
		}
		for (int i = 0; i < arrayTest.length; i++) {
			System.out.println(arrayTest[i]);
		}
		
		// 향상된 for문(확장 for문)
		// 형식) for([배열 자료형][출력할 변수명]:[배열명] or [컬렉션 객체])
		for(int num:arrayTest) {
			System.out.print(num+"\t");
		}
		
	}

}
