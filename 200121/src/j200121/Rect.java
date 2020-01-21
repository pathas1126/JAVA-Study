package j200121;

public class Rect {
	int x;
	int y;

	// 매개변수 X, 반환값 X
	void square1() {
		System.out.println("사각형1 넓이: " + (x * y));
	}

	// 매개변수 O, 반환값 X
	void square2(int a, int b) {
		System.out.println("사각형2 넓이: " + (a * b));
	}

	// 매개변수 O, 반환값 O
	int square3(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		Rect rect = new Rect();
		rect.x = 10;
		rect.y = 20;
		rect.square1();
		rect.square2(15, 15);

		int square3 = rect.square3(11, 12);
		System.out.println("사각형3 넓이: " + square3);
		/*
		 * 위의 두 줄의 코드를 다음과 같이 표현할 수 있음
		 * System.out.println("사각형 넓이: " + rect.square3(11,12)); 
		 */
	}
}
