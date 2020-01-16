package J200116;

public class Op4 {

	public static void main(String[] args) {
		// »ïÇ×¿¬»êÀÚ
		int a = 5, b = 7, x = 10, y = -10;

		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		System.out.println("absX: " + absX);
		System.out.println("absY: " + absY);

		a += b;
		System.out.println("a: " + a);

		a -= b;
		System.out.println("a: " + a);

		a *= b;
		System.out.println("a: " + a);

		a /= b;
		System.out.println("a: " + a);

		a %= b;
		System.out.println("a: " + a);
	}

}
