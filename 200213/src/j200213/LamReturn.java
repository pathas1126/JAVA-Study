package j200213;

@FunctionalInterface
interface Return {
	int plus(int x, int y);
}

public class LamReturn {

	public static void main(String[] args) {

		// Return 인터페이스형 객체 초기화
		Return rt = returnRT();
		
		// Return 객체로 메소드 호출 및 결과 저장
		int result = rt.plus(5, 4);
		
		// 결과 출력
		System.out.println(result);	// 9
	}

	// Return 인터페이스 객체 반환 메소드
	public static Return returnRT() {
		/*
		Return rt = (x, y) -> x + y;
		return rt;
		*/
		// 반환 값에 람다식 구현
		return (x, y) -> x + y;
	}
}
