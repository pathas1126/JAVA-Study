package j200206;

// java.io: ����¿� �ʿ��� package
import java.io.*;

public class WriteHello {

	public static void main(String[] args) {
		// byte: ������ ���� ����
		byte hello[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10 };
		byte a = 72;

		// System.out: ǥ�� ���, System.in: ǥ�� �Է�
		// ������ ����� ������ Ȯ���Ҷ� ���(�ִ� �״�� ���)
		System.out.println(a);

		// hello �迭 ��ġ ���
		System.out.println(hello);

		// � ��/��� Ŭ�������� write�� read�� ��� ����
		// ����(������ ���� ����)�� ���� �뷮 �̻��� �׿��� ����� ������
		// ����� ���� ����� ���� ��
		System.out.write(a);
		// �����͸� ��ȯ�ؼ� ���
		// ��ǻ�ʹ� ���ڷ� ����ϰ� ������, ����̱� ������ ����� ���� �� �ִ� ���� ��, H�� ��µ�
		// �ƽ�Ű�ڵ带 ���ڵ��ؼ� ���

		// �����͸� �׾Ƶ��� ���� �ٰ� ����ϵ��� �ϴ� �޼ҵ�
		System.out.flush();

		try {
			System.out.write(hello); // ������� �� ������ �ݵ�� ����ó���� �ؾ���
			throw new IOException("������ �߻��߽���");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
