package j200211;

import java.io.*;
import java.net.*;

public class URLTest {

	public URLTest(String s) throws Exception {
		// URl Ŭ���� ��ü ����
		URL url = new URL(s);

		// ������ ��ǻ���� ��Ʈ�� �̿�
		InputStream in = url.openStream();

		// �����͸� �����ͼ� ���� �� �ֿܼ� ���
		String ss;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		// �����͸� ��� �о���� �� �ִ� ���¶�� �ֿܼ� ���
		while ((ss = br.readLine()) != null) {
			System.out.println(ss);
			// ���Ͽ� ���: FileOutputStream, FileWriter
		}

		// ��Ʈ�� ��� �� �޸� ����
		in.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {

		// URLTest ��ü ����
		URLTest ult = new URLTest("http://www.naver.com");

	}
}
