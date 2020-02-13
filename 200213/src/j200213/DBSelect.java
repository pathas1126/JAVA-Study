package j200213;

// DB 접속 -> 테이블 생성
import java.sql.*;

public class DBSelect {

	public static void main(String[] args) {
		// DB에 접속하기 위해서는 Connection 인터페이스의 객체가 필요함
		Connection conn = null;

		// url 형식) jdbc:oracle:thin:@상대방의 접속 IP:접속 포트 번호(1521):SID(orcl)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		// SQL 문장 객체 변수, try~catch문 내부에 선언하면 변수로 인식을 못하는 경우가 발생
		Statement stmt = null; // 테이블 생성
		PreparedStatement pstmt = null; // 매개변수를 이용한 SQL 문장 객체
		Statement stmt2 = null; // SELECT문 수행
		ResultSet rs = null; // SELECT 결과를 표 형태로 저장
		String sql = ""; // SQL문 저장 변수

		try {
			// 접속할 드라이버를 메모리에 올리기(상위패키지명.하위패키지명..클래스명)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 접속하기 위해서 로그인 인증
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);

			// 테이블 생성
			stmt = conn.createStatement();
			sql = "CREATE TABLE MyTEST(name varchar2(20), age number)";
			int create = stmt.executeUpdate(sql);
			System.out.println("테이블 생성 성공??: " + create);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
