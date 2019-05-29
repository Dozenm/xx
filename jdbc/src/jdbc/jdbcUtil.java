package jdbc;
/**
 * jdbc工具类
 * anthor 何金华
 * 2019.5.7
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.CORBA.PUBLIC_MEMBER;

public class jdbcUtil {
	public static final String ORACLEDRIVER="oracle.jdbc.driver.OracleDriver";
	public static final String USERNAME="test";
	public static final String PASSWORD="test";
	public static final String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//加载驱动
	static {
		try {
			Class.forName(ORACLEDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//建立连接
	public static Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(URL,"test","test");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	//设置事物不自动提交
	public static void transactionController(Connection con) {
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//提交
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//回滚
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//释放资源
	public static void release(Connection con,Statement stmt,ResultSet re) {
		if(re!=null) {
			try {
				re.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	

}
