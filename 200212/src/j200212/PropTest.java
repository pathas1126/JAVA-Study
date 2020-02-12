package j200212;

import java.io.*;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		// Properties ��ü ����
		Properties pro = new Properties();

		try {
			// ���� �ҷ�����, ������̹Ƿ� ���� ó�� ����
			FileInputStream fis = new FileInputStream(
					"C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\ex1.properties");

			// fis ��Ʈ�����κ��� key=value ������Ƽ ����Ʈ�� �о� ����
			pro.load(fis);

			// ������Ƽ ����Ʈ ���
			System.out.println(pro);

			// �� key�� �ش��ϴ� value ���
			System.out.println(pro.getProperty("a"));
			System.out.println(pro.getProperty("b"));

			// a key�� �ش��ϴ� ���� "merong"���� ����
			pro.setProperty("a", "merong");
			System.out.println(pro.getProperty("a"));

			// ����� ������Ƽ ����Ʈ�� ���Ͽ� ���� ��
			pro.store(new FileOutputStream("C:\\webtest\\3.java\\JAVA-Study\\200212\\src\\j200212\\ex1.properties"),
					"This is a comment.");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
