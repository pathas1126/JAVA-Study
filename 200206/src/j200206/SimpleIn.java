package j200206;

// Ű����� �Է��� �޾Ƽ� �Է¹��� ���� �״�� �ֿܼ� ���
import java.io.*;
// System.in.read() => Ű���� �ڷḦ �о�鿩�� <=> System.in.write()

public class SimpleIn {
	// ����� �޼ҵ�� �ݵ�� ����ó���� ���־����
	// ���ܰ� �߻����� �ʴ� ��쿡�� throws������ �����ϰ� ó��
	public static void main(String[] args) throws IOException {

		// ������, �ѱ�, ����, Ư����ȣ -> ��ǻ�ʹ� ��� ���ڷ� �о� ����, ���� ���ڷ� �ڷ����� ������
		int charRead;
		System.out.println("�ƹ� ���ڿ��̳� �Է� �Ͻÿ�");
		// �󸶳� �о�������� �� �� ���� ������ while�� ���
		// �ƽ�Ű�ڵ�, �����ڵ�� ���� 0�̻��� ���� �̷���� �ְ�,
		// System.in.read()�� ������ ���� �� ���� �� -1�� �����ϱ� ������ �Ʒ��� ���� ���ǽ� �ۼ�
		while ((charRead = System.in.read()) >= 0) {
			System.out.write(charRead);
		}

	}

}
