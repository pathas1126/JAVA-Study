package j200129;

public class ArgTestConvert {

	public static void main(String[] x) {
		// main()�� �Ű������� �ڷ����� ������ �� ����

		// ���� �迭
		// String[] x = new String[3]; �⺻���� �迭 ��� �ʱ�ȭ x[0] = "a"; x[1] = "b"; x[2] =
		// "c";

		int sum;
		String str1 = x[0];
		String str2 = x[1];
		String str3 = x[2];
		// ����ȯ�� ���� �ڷ��� ���� �������� ����
		// String(������ �ڷ���), int(�⺻ �ڷ���) �� ����ȯ �Ұ�

		System.out.println("str: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int int3 = Integer.parseInt(str3);

		sum = int1 + int2 + int3;

		String sumStr = Integer.toString(sum);
		System.out.println("�հ�: " + sumStr);

	}

}