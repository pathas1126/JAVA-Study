package j200128;
// 다른 패키지에 있는 클래스를 사용하고자 할 때는 import문을 작성해야 함
// 형식) import 최상위패키지명.하위패키지명...불러올 클래스명;
// 자동 import 단축키 Ctrl + Shift + O

import java.util.Scanner;

// 5개 과목의 점수를 입력받아서 총점, 평균 구하기
public class ArgTest3 {

	
	
	public static void main(String[] args) {
		// 콘솔 창에서 키보드를 통해서 값을 입력받는 경우
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = sc.next();
		System.out.println("입력받은 문자: "+str);
		
		System.out.println("정수를 입력하세요");
		int integer = sc.nextInt();
		System.out.println("입력받은 정수: "+integer);
		
		System.out.println("실수를 입력하세요");
		double dbl = sc.nextDouble();
		System.out.println("입력받은 실수: "+dbl);
	}

}
