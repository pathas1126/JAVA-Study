package j200213;

@FunctionalInterface
interface Lambda {
	void showString(String str);
}

public class LamPara {

	public static void main(String[] args) {
		// 람다식을 인터페이스형 변수에 대입
		Lambda ld = s -> System.out.println(s);

		// 그 변수를 사용해 람다식 구현부 호출
		ld.showString("Hello lambda"); // Hello lambda

		// 메소드 매개변수로 람다식 대입 변수 전달
		showMyString(ld); 	// 안녕 람다?

	}

	// lambda 인터페이스형 객체를 매개변수로 받는 함수
	public static void showMyString(Lambda ld) {
		ld.showString("안녕 람다?");
	}
}
