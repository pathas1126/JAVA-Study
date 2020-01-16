package J200116;

public class Op6Cast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20, num2 = 30;
		// 형식) printf("출력양식",출력대상자,,,) : %d(정수값), %c(문자), %s(문자열), %f(소수점)
		System.out.printf("첫 번째 숫자=%d, 두 번째 숫자=%d", num1, num2);
		System.out.println(); // 줄바꿈
		System.out.print('\n'); // 줄바꿈 특수기호 사용

		// 형변환
		char ch = 'A';
		System.out.println("ch: " + ch); // 내부에 저장된 ASCII 값을 변환해서 출력
		System.out.printf("문자 %c의 ASCII 값 : %d\n", ch, (int) ch);
		// printf의 %d는 숫자를 그대로 출력하기 때문에 ch를 int로 형변환 해주어야 함
		int ch2 = ch;
		System.out.println("ch2: " + ch2);

		// 활용
		int java = 90, jsp = 85, oracle = 70;
		int sum = java + jsp + oracle;
		System.out.printf("sum=%d입니다.\n", sum);
		
		int avg=sum/3;
		double avg2 = sum/3;
		System.out.println("avg: "+avg+", avg2: "+avg2); // avg2: 81.0
		
		double avg3 = (double)sum/3;
		System.out.println("avg3: "+avg3);
		// 형식 %f, %.소수점자리수f ex) %.2f
		System.out.printf("avg3: %.2f", avg3);
	}

}
