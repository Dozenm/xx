package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPaperStatement {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		con=jdbcUtil.getConnection();
		pstmt=con.prepareStatement("insert into studentjava values(?,?)");
		pstmt.setInt(1, 71);
		pstmt.setString(2, "456");
//		pstmt.setInt(1, 56);
//		pstmt.setString(2, "yi");
		System.out.println(pstmt.executeUpdate());
		pstmt.setInt(1, 72);
		pstmt.setString(2, "456");
		System.out.println(pstmt.executeUpdate());
	}

}
