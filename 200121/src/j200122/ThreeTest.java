package j200122;

public class ThreeTest {

	int getMaxPrint(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		else if (b >= a && b >= c)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 4;
		int c = 19;

		ThreeTest tt = new ThreeTest();
		int result = tt.getMaxPrint(a, b, c);
		System.out.println("최댓값은 " + result + "입니다.");
	}

}
