package j200211;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc1 = Test.getInstance();
		Scanner sc2 = Test.getInstance();

		System.out.println("�� ��ü�� ���� ��ü�ΰ���?");
		if (sc1 == sc2) {
			System.out.println("�� ���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ƴմϴ�.");
		}

//		Test t = new Test(); ���ο� ��ü ���� �Ұ�

	}
}
