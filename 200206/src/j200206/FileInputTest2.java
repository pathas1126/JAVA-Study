package j200206;

// ������ ������ �о� �鿩�� �ٸ� ���Ϸ� �����ؼ� ���
import java.io.*;

public class FileInputTest2 {

	public static void main(String[] args) throws Exception {

		// �ش� ������ �о���̴� ��Ʈ�� ��ü ����
		FileInputStream fis = new FileInputStream("C:/webtest/SCaptureSetup121.exe");

		// ������ ����� ��Ʈ�� ��ü ����
//		FileOutputStream fos = new FileOutputStream("C:/webtest/3.java/JAVA-Study/200206/src/j200206/Test.exe");
		FileOutputStream fos = new FileOutputStream(
				new File("C:/webtest/3.java/JAVA-Study/200206/src/j200206/Test.exe"));

		// ������ �ӽ÷� ������ ����
		int read = 0;

//		while (read != -1) {
//			read = fis.read();
//			System.out.write(read);
//		}

		while (true) {
			read = fis.read();
			// read ���� -1�� �Ǹ� Ż����
			if (read == -1)
				break;
			fos.write(read);
		}

	}

}
