package j200211;

public class SingTestTest {

	public static void main(String[] args) {
		// ��ü ����, SingTest Ŭ������ �ν��Ͻ��� ��ȯ ����
		SingTest st1 = SingTest.getInstance();
		SingTest st2 = SingTest.getInstance();

		// ������ �ν��Ͻ����� ��
		if (st1 == st2) {
			System.out.println("st1 �ּ�: " + st1);
			System.out.println("st2 �ּ�: " + st2);
			System.out.println("���� �ν��Ͻ� �Դϴ�.");
		}
		/*
		 */
	}

}
