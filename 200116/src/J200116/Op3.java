package J200116;

public class Op3 {

	public static void main(String[] args) {
		boolean b = 2 > 3 && 5 < 7;
		// ù ���� ���� F�̸� �� ��° �� ���� ���þ��� ������ F�� ��ȯ�ϱ� ������ �� ��° �� ��� ����

		int t1 = 3, t2 = 5, t3 = 7;
		int t4;
		boolean b1, b2, b3;
		boolean b4 = true;

		System.out.println("(t1>t2)?: " + (t1 > t2));
		System.out.println("(t2<t3)?: " + (t2 < t3));

		// **����, �������� ȥ�� ����**
		// &&, ||
		b1 = (t1 > t2) && (t2 < t3);
		System.out.println("(t1>t2) && (t2<t3): " + b1);
		b2 = (t1 > t2) || (t2 < t3);
		System.out.println("(t1>t2) || (t2<t3): " + b2);

		// !
		b3 = !b4;
		System.out.println("!b4: " + b3);

		// &, |
		b1 = (t1 > t2) & (t2 < t3);
		System.out.println("(t1>t2) & (t2<t3): " + b1);
		b2 = (t1 > t2) | (t2 < t3);
		System.out.println("(t1>t2) | (t2<t3): " + b2);

		// ^
		b2 = (t1 > t2) ^ (t2 < t3);
		System.out.println("(t1>t2) ^ (t2<t3): " + b2);
	}

}
