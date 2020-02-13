package j200213;

// DB ���� -> ���̺� ���� -> �Է� -> �˻� -> ���
import java.sql.*;

public class DBSelect2 {

	public static void main(String[] args) {
		// DB�� �����ϱ� ���ؼ��� Connection �������̽��� ��ü�� �ʿ���
		Connection conn = null;

		// url ����) jdbc:oracle:thin:@������ ���� IP:���� ��Ʈ ��ȣ(1521):SID(orcl)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		// SQL ���� ��ü ����, try~catch�� ���ο� �����ϸ� ������ �ν��� ���ϴ� ��찡 �߻�
		Statement stmt = null; // ���̺� ����
		PreparedStatement pstmt = null; // �Ű������� �̿��� SQL ���� ��ü
		Statement stmt2 = null; // SELECT�� ����
		ResultSet rs = null; // SELECT ����� ǥ ���·� ����
		String sql = ""; // SQL�� ���� ����

		try {
			// ������ ����̹��� �޸𸮿� �ø���(������Ű����.������Ű����..Ŭ������)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// �����ϱ� ���ؼ� �α��� ����
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);

			// ���̺� ����
			stmt = conn.createStatement();
			sql = "CREATE TABLE MyTEST(name varchar2(20), age number)";
			int create = stmt.executeUpdate(sql);
			System.out.println("���̺� ���� ����??: " + create);

			// insert, ������ �Է�
			sql = "insert into MyTest values(?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "ȫ�浿");
			pstmt.setInt(2, 34);
			int insert = pstmt.executeUpdate();
			System.out.println("�Է� ������ ����: " + insert);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
