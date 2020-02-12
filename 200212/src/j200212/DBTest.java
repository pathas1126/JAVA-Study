package j200212;

import java.sql.*;

public class DBTest {

	public static void main(String[] args) {
		// DB�� �����ϱ� ���ؼ��� Connection �������̽��� ��ü�� �ʿ���
		Connection con = null;

		// url ����) jdbc:oracle:thin:@������ ���� IP:���� ��Ʈ ��ȣ(1521):SID(orcl)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		try {
			// ������ ����̹��� �޸𸮿� �ø���(������Ű����.������Ű����..Ŭ������)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// �����ϱ� ���ؼ� �α��� ����
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(con);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
