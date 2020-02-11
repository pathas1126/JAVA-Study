package j200211;

import java.util.Scanner;

public class Test {

	// �����ڿ� private �ο�
	private Test() {
	}

	// Scanner Ŭ���� ���� sc�� private �ο�
	private static Scanner sc;

	// Scanner ��ü ��ȯ �޼ҵ�
	public static Scanner getInstance() {
		synchronized (Test.class) {
			if (sc == null) {
				sc = new Scanner(System.in);
			}
			return sc;
		}
	}

}
