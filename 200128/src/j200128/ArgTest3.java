package j200128;
// �ٸ� ��Ű���� �ִ� Ŭ������ ����ϰ��� �� ���� import���� �ۼ��ؾ� ��
// ����) import �ֻ�����Ű����.������Ű����...�ҷ��� Ŭ������;
// �ڵ� import ����Ű Ctrl + Shift + O

import java.util.Scanner;

// 5�� ������ ������ �Է¹޾Ƽ� ����, ��� ���ϱ�
public class ArgTest3 {

	
	
	public static void main(String[] args) {
		// �ܼ� â���� Ű���带 ���ؼ� ���� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.next();
		System.out.println("�Է¹��� ����: "+str);
		
		System.out.println("������ �Է��ϼ���");
		int integer = sc.nextInt();
		System.out.println("�Է¹��� ����: "+integer);
		
		System.out.println("�Ǽ��� �Է��ϼ���");
		double dbl = sc.nextDouble();
		System.out.println("�Է¹��� �Ǽ�: "+dbl);
	}

}
