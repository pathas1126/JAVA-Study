package j200206;

import java.io.*;

public class ReverseTest {

	String str;

	BufferedReader setBuffer() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

	void getBuffer(BufferedReader br) {
		try {
			System.out.println("���ڿ��� �Է��ϼ���");
			str = br.readLine();
			String[] strarr = str.split("");
			for (int i = strarr.length - 1; i >= 0; i--) {
				System.out.print(strarr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		ReverseTest rt = new ReverseTest();

		BufferedReader br = rt.setBuffer();
		rt.getBuffer(br);
	}

}
