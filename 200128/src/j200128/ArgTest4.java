package j200128;

public class ArgTest4 {

	public static void main(String[] x) {

		// 고정 배열
		// String[] x = new String[3]; 기본적인 배열 요소 초기화 x[0] = "a"; x[1] = "b"; x[2] =
		// "c";

		int sum;
		String str1 = x[0];
		String str2 = x[1];
		String str3 = x[2];

		System.out.println("str: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int int3 = Integer.parseInt(str3);

		sum = int1 + int2 + int3;
		System.out.println("합계: " + sum);


		
	}

}
