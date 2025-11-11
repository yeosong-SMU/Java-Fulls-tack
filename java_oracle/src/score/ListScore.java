package score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DB;

public class ListScore {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.oraConn();
			String sql = "select student_no, name, kor, eng, mat, kor+eng+mat 총점, round((kor+eng+mat)/3, 2) 평균, case when (kor+eng+mat)/3 >= 90 then 'A' when (kor+eng+mat)/3 >= 80 then 'B' when (kor+eng+mat)/3 >= 70 then 'C' when (kor+eng+mat)/3 >= 60 then 'D' else 'F' end 등급 from score";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
			while (rs.next()) {
				String student_no = rs.getString("student_no");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt("mat");
				int tot = rs.getInt("총점");
				double avg = rs.getDouble("평균");
				String grade = rs.getString("등급");
				System.out.println(String.format("%s\t%s\t%d\t%d\t%d\t%d\t4.1f\t%s", student_no, name, kor, eng, mat,
						tot, avg, grade));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
