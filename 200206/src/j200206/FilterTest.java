package j200206;

import java.io.*;

public class FilterTest {

	public static void main(String[] args) throws Exception {

		// �Ű������� �ڷ������� �θ�Ŭ���� ����-> �θ�Ŭ���� ��ü �Ӹ� �ƴ϶� ��Ӱ��迡 �ִ�
		// �ڽ�Ŭ������ ��ü�� �Ű������� ���޹��� �� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// Ű���带 ���ؼ� �о���̴µ�, �ѱ��� ������ �ʵ��� �ϰ�,
		// �� ���� ���� ���� �����͸� �о� �鿩��(���۸� ���)
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, total;

		System.out.println("�̸���?");
		name = bb.readLine();
		System.out.println("���� ������?");
		kor = Integer.parseInt(bb.readLine());
		System.out.println("���� ������?");
		eng = Integer.parseInt(bb.readLine());
		
		bb.close();

		total = kor + eng;
		System.out.println(name + "�� ���� ������ �� " + total + "���Դϴ�.");
	}

}
