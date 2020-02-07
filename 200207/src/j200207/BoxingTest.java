package j200207;

public class BoxingTest {

	public static void main(String[] args) {
		// �ڵ� unboxing, Wrapper�� �⺻ �ڷ������� ��ȯ
		// int obj = 10;
		Integer obj = new Integer(10);
		int sum = obj.intValue() + 20; // 10(��ü��) + 20(�ڷ���) => �⺻ �ڷ��� + �⺻ �ڷ���
		System.out.println("sum: " + sum);

		// �ڵ� boxing, �⺻ �ڷ����� Wrapper�� ��ȯ
		Double d = new Double(123.45);
		printDouble(d);
		printDouble(123.22);

		Integer num1 = new Integer(123);
		int num2 = 200;
		int sum2 = num1 + num2; // ��ڽ�: num1.intValue()�� ��ȯ
		Integer num3 = num2; // ����ڽ�: Integer.valueOf(num2) �� ��ȯ
	}

	// Double�� ���� �Ҽ����� ����ϱ� ���� ���ڿ��� ����ϴ� �޼ҵ�
	public static void printDouble(Double obj2) {
		System.out.println(obj2.toString());
	}
}
