package j200131;

// �߻� �޼ҵ带 ���� �߻� Ŭ����
abstract class Exam {

	// �Ϲ� �޼ҵ�
	public int sum(int x, int y) {
		return x + y;
	}

	// �߻� �޼ҵ�, �ڽ� Ŭ�������� �������̵��� �Ϸ��ؾ� ��

	// ���� Ŭ�������� "�ȳ�?"�� ����ϴ� �޼ҵ�� ����
	abstract public void sayHi();

	// ���� Ŭ�������� �Ű����� a�� b�� ���� �� ����� ����ϴ� �޼ҵ�� ����
	abstract public void printSum(int a, int b);
}

public class AbstractTest extends Exam {

	// Exam Ŭ������ sayHi() �߻� �޼ҵ� �������̵�
	public void sayHi() {
		System.out.println("�ȳ�?");
	}

	// Exam Ŭ������ printSum() �߻� �޼ҵ� �������̵�
	public void printSum(int a, int b) {
		int result = sum(a, b);
		System.out.println(a + "��(��) " + b + "�� ���� " + result + "(��)��");
	}

	public static void main(String[] args) {

		// ���� Ŭ������ AbstractTest ��ü ����
		AbstractTest at = new AbstractTest();

		// AbstractTest Ŭ�������� �����ǵ� �޼ҵ� ȣ��
		at.sayHi();
		at.printSum(30, 40);

	}

}
