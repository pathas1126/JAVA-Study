package j200130.abc;

// �ܺ� ��Ű���� ThreeTest2 Ŭ���� import
import j200130.ThreeTest2;
import java.util.Scanner;

// �ܺ� ��Ű���� ThreeTest2 Ŭ���� ���
public class ThreeSub extends ThreeTest2 {

	public static void main(String[] args) {
		// ��ĳ�� ��ü sc2 ����
		Scanner sc2 = new Scanner(System.in);

		// int a, b, c ������ �� ���� �Է�
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int a = sc2.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int b = sc2.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int c = sc2.nextInt();

		// �ڽ� Ŭ���� ��ü ����
		ThreeSub ts = new ThreeSub();
		// �θ� Ŭ���� �Ϲ� �޼ҵ�� �ִ� ���ϱ�
		int max = ts.getMax(a, b, c);
		// �ִ� ���
		System.out.println("�ִ�: " + max);
		// �θ� Ŭ���� �Ϲ� �޼ҵ�� �ִ� ������ ������ ���
		ts.printMax(max);

		// �θ� Ŭ���� ���� �޼ҵ�� �ִ� ���ϱ�
		int max2 = ThreeSub.getMaxS(a, b, c);
		// �ִ� ���
		System.out.println("�ִ�: " + max2);
		// �θ� Ŭ���� ���� �޼ҵ�� �ִ� ������ ������ ���
		ThreeSub.printMaxS(max2);
	}

}
