package j200213;

@FunctionalInterface
interface Xyz2 {
	public int a(int x, int y);
}

public class LamTest2 {

	public static void main(String[] args) {

		// �͸� ���� Ŭ����
		Xyz2 anonymousInner = new Xyz2() {
			public int a(int x, int y) {
				return x + y;
			}
		};

		int resultA = anonymousInner.a(1, 9);

		System.out.println(resultA);

		// ���ٽ�
		Xyz2 lambda = (x, y) -> x + y;
		int resultB = lambda.a(4, 5);

		System.out.println(resultB);

	}

}
