package J200115;

public class VarTest {

	public static void main(String[] args) {
		// �ڷ��� ������;
		int age;
		age = 23;
		System.out.println("���� �� ���̴� : " + age + "�Դϴ�.");

		byte b = 23;
		// ���� b�� �����ϸ鼭 23���� ����

		short c = 12;
		// byte�ε� ������ �� �ִ� ���ڸ� short�� �����ϸ� �޸� ���� �߻�

		int sum = b + c;
		/*
		 * b + c = 35�̹Ƿ� byte���� ����� ��� �� ������, b + c ���� ��������ڰ� ���ǰ� �ְ� java�� �⺻ ���� ������
		 * int�̱� ������ int �ڷ����� ����ؾ� ��
		 */
		System.out.println("sum�� ��: " + sum);

		// �ֹε�Ϲ�ȣ ����
		long no = 1234567890000L;
		System.out.println("no �� : " + no);

	}

}
