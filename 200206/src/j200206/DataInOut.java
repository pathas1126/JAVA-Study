package j200206;

import java.io.*;

public class DataInOut {

	public static void main(String[] args) throws Exception {
		// 1. ���Ϸ� ����
		FileOutputStream fos = new FileOutputStream("c:/webtest/3.java/data.txt");

		// 2. �ڹ��� �ڷ����� �°� ����
		DataOutputStream dos = new DataOutputStream(fos);

		// 3. �޸��� �ڷ����� �°� ����
		char han = '��'; // �����ڵ� 0~65535
		System.out.println((int) han);
		byte b = 21;
		String str = "bg\n";
		byte ba[] = { 65, 66, 67 }; // A, B, C ��ȯ

		// DataOutputStream �޼ҵ带 ����ؾ� ��
		dos.writeChar(han);
		dos.writeByte(b);
		dos.writeBytes(str);
		dos.write(ba);

		// ���Ͽ� �ڷ� ��� �� ��Ʈ�� �޸� ����
		dos.close();
		fos.close();

	}

}
