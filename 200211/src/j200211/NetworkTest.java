package j200211;

import java.net.*; // InetAddress, Socket, ServerSocket

public class NetworkTest {

	public static void main(String[] args) throws Exception {

		// 하나의 ip 주소를 저장
		InetAddress ia = null;

		// www.daum.net의 도메인, IP 주소를 가진 객체 반환
		ia = InetAddress.getByName("www.daum.net");

		// ia 객체의 IP 주소 반환
		System.out.println(ia.getHostAddress());

		// 두 대 이상의 컴퓨터 주소 관리
		InetAddress ia2[];

		// www.daum.net의 모든 도메인, IP 주소 저장
		ia2 = InetAddress.getAllByName("www.daum.net");

		// 확장 for문, 출력
		for (InetAddress i : ia2) {
			System.out.println(i.getHostAddress());
		}

		// 자기 컴퓨터 정보를 담은 객체 생성
		InetAddress host = InetAddress.getLocalHost();

		// host 이름 출력
		System.out.println(host.getHostName());

		// host IP 주소 출력
		System.out.println(host.getHostAddress());
	}

}
