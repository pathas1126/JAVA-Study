package j200206;

import java.io.*;

public class DataInOut2 {

	public static void main(String[] args) throws Exception {
		// 1. ���Ϸ� ����
		File f = new File("c:/webtest/3.java/data.txt");
		FileOutputStream fos = new FileOutputStream(f);

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

		// �ڹ��� �ڷ����� �°� ������ �ڷḦ �о���� ��ü ����
		DataInputStream dis = new DataInputStream(new FileInputStream(f));

		// �ҷ��� ���� ���ο� ������ ����
		char c = dis.readChar();
		byte b2 = dis.readByte();
		// readLine()�� �� �̻� �������� �ʴ� �޼ҵ�, BufferedReader Ŭ������ readLine() �޼ҵ带 ������ �����
		String str2 = dis.readLine();
		byte bb[] = new byte[3];
		dis.read(bb);

		System.out.println("c:" + c);
		System.out.println("b2:" + b2);
		System.out.println("str2:" + str2);
		// ���ڿ��� byte[]�� ��ȯ, �ּҰ� ���
		System.out.println("str2:" + str2.getBytes());
		System.out.println("bb:" + bb);
		// byte[]�� �Ű������� �ϴ� �����ڸ� ����ؼ� String���� ���
		System.out.println(new String(bb));
	
	}

}
