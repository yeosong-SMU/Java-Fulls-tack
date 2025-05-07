package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressList {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String id = "java";
		String pwd = "1234";

		Connection conn = null;
		Statement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			String sql = "select * from address";
			// stmt = conn.createStatement(0, 0)
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
