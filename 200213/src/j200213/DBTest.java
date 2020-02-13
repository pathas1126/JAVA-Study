package j200213;

import java.sql.*;

public class DBTest {

	public static void main(String[] args) {
		// DB에 접속하기 위해서는 Connection 인터페이스의 객체가 필요함
		Connection conn = null;

		// url 형식) jdbc:oracle:thin:@상대방의 접속 IP:접속 포트 번호(1521):SID(orcl)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		try {
			// 접속할 드라이버를 메모리에 올리기(상위패키지명.하위패키지명..클래스명)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 접속하기 위해서 로그인 인증
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

