package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//加载驱动
//		String string="oracle.jdbc.driver.OracleDriver";
//		Class.forName(strin
		//定义URL连接协议
//		String oracleURL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		
		//建立连接
//		connection=DriverManager.getConnection(oracleURL,"test", "test");
//		System.out.println(connection);
		connection=jdbcUtil.getConnection();
		//建立陈诉，用于执行SQL语句
		statement=connection.createStatement();
		String string2="create table student1(id number(10) primary key,name varchar2(10),birthday date,classname varchar2(10))";
		statement.executeUpdate(string2);
		
//		String string3="insert into studentjava values(5,'jlk')";
		String string4="insert into studentjava values(21,'wer')";
//		statement.executeQuery(string3);
//		resultset=statement.executeQuery(string4);
//		System.out.println(resultSet.getInt(""));
//		StringBuffer sb=new StringBuffer();
//		while(resultset.next()) {
//			sb.append(resultset.getInt("id"));
//			sb.append(resultset.getString(1));
//		}
//		System.out.println(sb.toString());
		//关闭资源
//		connection.close();
//		resultset.close();
//		statement.close();
		jdbcUtil.release(connection, statement, resultset);

	}

}
