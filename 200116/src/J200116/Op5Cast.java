package J200116;

public class Op5Cast {

	public static void main(String[] args) {
		// �ڵ� ����ȯ
		// 1. �����͸� �׺��� ū �ڷ����� ����� �ڵ� ����ȯ -> �޸� ���� ����
		short s = 12;
		// 2������ �����, ......64, 32, 16, 8, 4, 2, 1 | 12�� ��� 00000000 00001100
		int i = s; // 00000000 00000000 00000000 00001100 �޸� ���� ������

		// 2. ��� �߰��� �ڷ����� �ڵ����� ��ȯ��,
		// ���� �ٸ� �ڷ����� ����� ��� ���� ������ �� ū �ڷ������� �ڵ� ����ȯ
		char c = 'A';
		int n = c + 1; // char(2byte)+int(4byte) �� int(4byte) + int(4byte)
		System.out.println("n: " + n); // 66

		System.out.println("(char)n:" + (char) n); // B

		int su = (int) 3.5;
		System.out.println("(int)su:" + (int) su);

		int x = 123;
		float y = x + 12.3f; // int + float �� float + float �� float
		System.out.println("y: " + y);

		byte s2 = 12;
		short s3 = 45;
		int re = s2 + s3; // ��������ڰ� �ֱ� ������ int�� �������־�� ��
		System.out.println("re: " + re);

		// Java �̽ļ� : ��������ڷ� �׻� int�� �����, 
		short re2 = (short) (s2 + s3); //���� ����ȯ�� �� ������ ������ ���� ��ȣ�� ������� ��
		System.out.println("re2: " + re2);
		
		float f = 1.22f;
		float f2 = 4.22f;
		float f3 = (float)(f + f2);
		System.out.println(f3);
		// 5.4399996 ����? -> �ε��Ҽ��� ����
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
	}

}
