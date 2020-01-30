package j200130;

// import: 외부 패키지에 존재하는 클래스를 가져올 때 사용
import java.util.Scanner;
import j200130.abc.PrintTest;

public class RepeatChar {


	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자 입력
		System.out.println("문자를 입력하시오");
		// 문자열을 콘솔창으로부터 입력받은 뒤, 문자열 양 옆의 불필요한 공백 제거 
		String str = sc.nextLine().trim();
		// 문자열의 6번째 문자를 char형으로 반환해서 ch 변수에 저장
		char ch = str.charAt(6);
		
		// 숫자 입력
		System.out.println("숫자를 입력하시오");
		int n = sc.nextInt();
		
		// PrintTest 객체 선언
		PrintTest pt = new PrintTest();
		// PrintTest 인스턴스 메소드 호출
		pt.charPrint(n, ch);
		
		// 줄바꿈
		System.out.println();
		
		// PrintTest 정적 메소드 호출
		PrintTest.charPrintStatic(n, ch);
	}

}
