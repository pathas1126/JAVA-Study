package j200207;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// �ش� ���/���ϸ�.Ȯ���ڸ� �Ű������� �޾Ƽ� File ��ü ����
		File f = new File("fileTest.txt");

		// f ��ü�� ����ִ� ���Ϸ� ����
		Boolean b = f.createNewFile();
		System.out.println(b);		// true

		// f�� ���� �������� Ȯ��
		Boolean b2 = f.isFile();
		System.out.println(b2);		// false

		// f�� �������� Ȯ��
		Boolean b3 = f.isDirectory();
		System.out.println(b3);		// true

		// ������ �̸��� ���� ��
		String name = f.getName();
		System.out.println(name);	// fileTest.txt

		// ������ ���� ��θ� ������
		String absPath = f.getAbsolutePath();
		System.out.println(absPath);
		// C:\webtest\3.java\JAVA-Study\200207\fileTest.txt

		// ��ü ������ ������ ���� ��θ� ������
		String path = f.getPath();
		System.out.println(path);	//fileTest.txt

		// ������ ���� �� �ִ��� Ȯ��
		Boolean b4 = f.canRead();
		System.out.println(b4);		// true

		// ���Ͽ� �� �� �ִ��� Ȯ��
		Boolean b5 = f.canWrite();
		System.out.println(b5);		// true

		// ���� ����
		Boolean b6 = f.delete();
		System.out.println(b6);		// true

	}

}
