package j200211;

import java.net.*; // InetAddress, Socket, ServerSocket

public class NetworkTest {

	public static void main(String[] args) throws Exception {

		// �ϳ��� ip �ּҸ� ����
		InetAddress ia = null;

		// www.daum.net�� ������, IP �ּҸ� ���� ��ü ��ȯ
		ia = InetAddress.getByName("www.daum.net");

		// ia ��ü�� IP �ּ� ��ȯ
		System.out.println(ia.getHostAddress());

		// �� �� �̻��� ��ǻ�� �ּ� ����
		InetAddress ia2[];

		// www.daum.net�� ��� ������, IP �ּ� ����
		ia2 = InetAddress.getAllByName("www.daum.net");

		// Ȯ�� for��, ���
		for (InetAddress i : ia2) {
			System.out.println(i.getHostAddress());
		}

		// �ڱ� ��ǻ�� ������ ���� ��ü ����
		InetAddress host = InetAddress.getLocalHost();

		// host �̸� ���
		System.out.println(host.getHostName());

		// host IP �ּ� ���
		System.out.println(host.getHostAddress());
	}

}
