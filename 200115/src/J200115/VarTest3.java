package J200115;

public class VarTest3 {
	public static void main(String[] args) {
		System.out.println("������ ��");
		boolean b = true; // �ҹ��ڸ� �Է�
		boolean c = 2>3; // ���迬���ڷ� true/false�� ���� ����
		System.out.println("b��: "+b+", c��: "+c);
		
		char d = 'A';
		char d2 = 65; // �ƽ�Ű�����ε� ���� ǥ�� ����, char �ڷ����� ��� ���ڴ� ���ڸ� ����
		//16���� ���� �Է� �޾Ƽ� ���� ����, '\u0000'~'\uFFFF'�� ǥ��
		char d3 = '\u0041';
		// 10���� : 45, 8���� : 045, 16���� 0x45
		System.out.println("d��: "+d+", d2��: "+d2+", d3��: "+d3);
		
		String s1 = "�ĺ��� �ڹٱ��� ����";
		String s2 = "����, �ڷ���, ������";
		String s3 = s1+""+s2;
		System.out.println("s3: "+s3);
	}
}
