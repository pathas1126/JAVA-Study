package j200206;

// BufferedReader, InputStreamReader, FileWriter

import java.io.*;

public class Sawon {

	public static void main(String[] args) throws Exception {

		String mem_name = null; // �̸�
		String mem_id = null; // ���
		String mem_pwd = null; // ��ȣ
		String mem_gender = null; // ����
		String mem_age = null; // ����
		String mem_phone = null; // �ڵ��� ��ȣ
		// ��� ������ �ƴ� ��쿡�� String ���

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ѱ� ����: FileWriter, ���� ����: FileOutputStream
		File f = new File("C:/webtest/3.java/sawon.txt");

		// FileWriter Ŭ���� ��ü ����
		FileWriter fw = new FileWriter(f, true);

		System.out.println("====ȸ�� ���� �Է�====");

		// �� ������ ������ �Է�
		System.out.println("�̸�?");
		mem_name = br.readLine();
		System.out.println("ID?");
		mem_id = br.readLine();
		System.out.println("��ȣ?");
		mem_pwd = br.readLine();
		System.out.println("����?");
		mem_gender = br.readLine();
		System.out.println("����?");
		mem_age = br.readLine();
		System.out.println("�ڵ��� ��ȣ?");
		mem_phone = br.readLine();

		fw.write(mem_name + "\r\n"); // \r\n : �����쿡���� �ٹٲ� Ư����ȣ
		fw.write(mem_id + "\r\n");
		fw.write(mem_pwd + "\r\n");
		fw.write(mem_gender + "\r\n");
		fw.write(mem_age + "\r\n");
		fw.write(mem_phone);
		// ���ϰ� ����� ��Ʈ���� ����(�޸� ����), ��� ���۵� �����
		fw.close();
		// BufferedReader Ŭ���� ��ü ��Ʈ���� �ݾ��־�� ��
		br.close();

	}

}
