package j200130.abc;

// 외부 패키지의 ThreeTest2 클래스 import
import j200130.ThreeTest2;
import java.util.Scanner;

// 외부 패키지의 ThreeTest2 클래스 상속
public class ThreeSub extends ThreeTest2 {

	public static void main(String[] args) {
		// 스캐너 객체 sc2 생성
		Scanner sc2 = new Scanner(System.in);

		// int a, b, c 변수에 각 숫자 입력
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = sc2.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc2.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int c = sc2.nextInt();

		// 자식 클래스 객체 생성
		ThreeSub ts = new ThreeSub();
		// 부모 클래스 일반 메소드로 최댓값 구하기
		int max = ts.getMax(a, b, c);
		// 최댓값 출력
		System.out.println("최댓값: " + max);
		// 부모 클래스 일반 메소드로 최댓값 각각을 진수로 출력
		ts.printMax(max);

		// 부모 클래스 정적 메소드로 최댓값 구하기
		int max2 = ThreeSub.getMaxS(a, b, c);
		// 최댓값 출력
		System.out.println("최댓값: " + max2);
		// 부모 클래스 정적 메소드로 최댓값 각각을 진수로 출력
		ThreeSub.printMaxS(max2);
	}

}
