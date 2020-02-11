package j200211;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class URLTest2 {

	public URLTest2(String s) throws Exception {

		// URl Ŭ���� ��ü ����
		URL url = new URL(s);

		// ������ ��ǻ���� ��Ʈ�� �̿�
		InputStream in = url.openStream();

		// �����͸� �����ͼ� html ������ ����
		String html;
		// InputStreamReader + BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		// FileWriter
		FileWriter fw = new FileWriter("C:\\webtest\\3.java\\JAVA-Study\\200211\\url.txt");

		// �����͸� ������ �о���̸鼭 ���Ͽ� ���
		while (5 > 3) {
			html = br.readLine();
			fw.write(html);

			// �ֿܼ��� ���
			System.out.println(html);

			// �о�� ���� �������� while�� Ż��
			if (br.readLine() == null)
				break;
		}

		// ��Ʈ�� ��� �� �޸� ����
		in.close();
		br.close();
		fw.close();
	}

	public static void main(String[] args) throws Exception {

		// ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);

		// ���ڿ� �Է�
		System.out.println("����Ʈ ������ �ּҸ� �Է��ϼ���");
		String dom = "http://";
		dom += sc.nextLine();

		// �Էµ� ������ �ּ� Ȯ��
		System.out.println(dom);

		// URLTest ��ü ����
		URLTest2 ult = new URLTest2(dom);

	}
}
