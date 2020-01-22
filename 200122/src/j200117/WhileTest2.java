package j200117;

public class WhileTest2 {
	int start = 1;
	int end = 5;

	// 매개변수 X, 반환값 X, 멤버 변수 사용
	public void whilePrint() {
		if (start <= end) {
			while (start <= end) {
				System.out.println("while 출력" + start);
				start++;
			}
			System.out.println("출력 종료");
		} else {
			System.out.println("start값은 end값보다 클 수 없습니다!");
		}
	}

	// 매개변수 O, 반환값X, 멤버 변수 사용X
	// start가 멤버 변수와 겹치지 않기 때문에 this 사용 X
	public void whilePrint(int start, int end) {
		if (start <= end) {
			while (start <= end) {
				System.out.println("while 출력" + start);
				start++;
			}
			System.out.println("출력 종료");
		} else {
			System.out.println("start값은 end값보다 클 수 없습니다!");
		}
	}

	// 매개변수 O, 반환값 O
	public double whilePrint(double start, double end) {
		if (start <= end) {
			return (end - start) + 1;
		} else {
			System.out.println("start값은 end값보다 클 수 없습니다!");
			return 0;
		}
	}

	public static void main(String[] args) {

		// wt2 객체 생성
		WhileTest2 wt2 = new WhileTest2();
		// 매개변수 X, 반환값 X 메소드 실행
		wt2.whilePrint();
		// 매개변수 O, 반환값 X 메소드 실행
		wt2.whilePrint(2, 4);

		// 매개변수 O, 반환값 O 메소드 실행
		// 반환값을 반올림 후 int형으로 변수에 저장
		int i = (int) Math.round(wt2.whilePrint(25.22, 28.65));
		// start, end의 차이만큼 출력
		for (; i > 0; i--) {
			// 위에서 int i 가 선언되었기 때문에 초기식 생략
			System.out.println("while출력" + i);
		}
		System.out.println("출력 종료");
	}

}