package j200206;

// IO�� �ʿ��� Ŭ���� ���� import
import java.io.*;

public class ReaderTest {

	// ����� �޼ҵ� ���� �ݵ�� ���� ó���� ���־�� ��
	public static void main(String[] args) throws IOException {

		// FileWriter ��Ʈ�� ��ü ����, �ۼ��� ���� ����
		FileWriter fw = new FileWriter("ReadMe.txt");

		// ���Ͽ� ���� �ۼ�
		fw.write("FileWriter ��Ʈ������ �ۼ��� �����Դϴ�.");

		// fw ��Ʈ�� ��� �� �޸𸮿��� ����
		fw.close();

		// FileReader ��Ʈ�� ��ü ����, �ҷ��� ���� ����
		FileReader fr = new FileReader("ReadMe.txt");

		// �ҷ��� �ڷḦ �ӽ÷� ������ ���� ����
		int i = 0; // ���ڷ� �ҷ����� ������ �ڷ����� int

		// �о���� ������ ���
		while (true) {
			i = fr.read();
			// ���� �����Ͱ� ���� ��� while�� Ż��
			if (i == -1)
				break;
			// �ڷ����� int���̱� ������ char������ ����ȯ �� ���
			System.out.print((char) i);
		}

		// fr ��Ʈ�� ��� �� �޸𸮿��� ����
		fr.close();
	}

}
