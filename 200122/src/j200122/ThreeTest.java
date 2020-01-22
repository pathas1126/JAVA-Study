package j200122;

public class ThreeTest {

	// 삼항연산자를 이용해서 깔끔하게 작성
	int getMaxPrint(int a, int b, int c) {
		int max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}

	int getMinPrint(int a, int b, int c) {
		int min;
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		return min;
	}

	void getGap(int max, int min) {
		int gap = max - min;
		System.out.println("최댓값은 " + max + "입니다.");
		System.out.println("최솟값은 " + min + "입니다.");
		System.out.println("최댓값 - 최솟값: " + gap);
	}

	public static void main(String[] args) {
		int a = 111;
		int b = 21;
		int c = 2;

		// class에서 작성한 일반메소드(static X)는 반드시 객체 생성(4byte) 후 사용
		ThreeTest tt = new ThreeTest();
		int max = tt.getMaxPrint(a, b, c);

		int min = tt.getMinPrint(a, b, c);

		tt.getGap(max, min);

	}

}
