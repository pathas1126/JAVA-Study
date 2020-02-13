package j200213;

// DB ���� -> ���̺� ���� -> �ο� �Է� -> �˻� -> ���
import java.sql.*;

public class DBSelect3 {

	public static void main(String[] args) {
		// Connection �������̽��� ��ü ���� ����
		Connection conn = null;

		// DB url ����
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		// SQL ���� ��ü ����
		// try~catch�� ���ο� �����ϸ� ������ �ν��� ���ϴ� ��찡 �߻�
		Statement stmt = null; // ���̺� ���� SQL����
		PreparedStatement pstmt = null; // �Ű������� �̿��� SQL ����
		Statement stmt2 = null; // SELECT��
		ResultSet rs = null; // SELECT ��� ���� ResultSet ����
		String sql = ""; // SQL�� ���� ����

		// SQL ���� �޼ҵ� ���� SQLException ���ܸ� ó���ؾ� ��
		try {
			// JDBC ����̹��� �޸𸮿� �ø�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ������ DB ������ Connection ��ü ����
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);	// oracle.jdbc.driver.T4CConnection@27f8302d

			// Statement ��ü ����
			stmt = conn.createStatement();

			// ���̺� ���� SQL���� �ۼ�
			sql = "CREATE TABLE MyTEST(name varchar2(20), age number)";

			// sql���� ���� �� ��ȯ �� ����
			int create = stmt.executeUpdate(sql);

			// ��� Ȯ��
			System.out.println("���̺� ���� ����??: " + create);	// ���̺� ���� ����??: 0

			// INSERT��, ���̺� ������ �Է�
			sql = "INSERT INTO MyTEST VALUES(?, ?)";

			// SQL������ �Ű������� PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);

			// ù ��° �Ű�����(?)�� "ȫ�浿" ����
			pstmt.setString(1, "ȫ�浿");

			// �� ��° ?�� 34 ����
			pstmt.setInt(2, 34);

			// INSERT�� ���� �� ��ȯ �� ����
			int insert = pstmt.executeUpdate();

			// ��� Ȯ��
			System.out.println("�Է� ������ ����: " + insert);	// �Է� ������ ����: 1

			// SELECT��, ���̺� �� ������ ��ȸ
			stmt2 = conn.createStatement();

			// Query ��ȯ�� ResultSet ��ü ��ȯ
			rs = stmt2.executeQuery("SELECT * FROM MyTEST");

			// ������ �����͸� ���� ���� ����
			String name; // �̸�
			int age; // ����

			// ResultSet�� ���� �ο찡 �ִ� ���� ��� ������ ��ȸ
			while (rs.next()) {
				// name�� "name" �÷� ������ ����
				name = rs.getString("name");

				// age�� "age" �÷� ������ ����
				age = rs.getInt("age");

				// ���
				System.out.println("�̸�: " + name + ", ����: " + age);		// �̸�: ȫ�浿, ����: 34
			}

		} catch (Exception e) {
			System.out.println(e);

			// ���ܿ� ������� �޸𸮿��� �����ϱ� ���� finally���� �ۼ�
		} finally {
			// close() ���� ���� ó���� �ʿ���
			try {
				// �޸� ����
				rs.close();
				stmt2.close();
				pstmt.close();
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
