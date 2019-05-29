package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import jdbc.jdbcUtil;
import student.Student;

public class Dao implements IDao {
	Connection con=null;
	public void setConnection(Connection con) {
		this.con=con;
	}

	@Override
	public void addStudent(Student stu) throws SQLException {
		// TODO Auto-generated method stub
		con=jdbcUtil.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student1 values(?,?,?,?)");
		ps.setInt(1, stu.getId());
		ps.setString(2, stu.getName());
		long times=stu.getBirthday().getTime();
		Date date1=new Date(times);
		ps.setDate(3, date1);
		ps.setString(4, stu.getClassname());
		int i=ps.executeUpdate();
		jdbcUtil.release(con, ps, null);

	}

	@Override
	public void delectStudent(int id) throws SQLException {
		// TODO Auto-generated method stub
		con=jdbcUtil.getConnection();
		String sql="delete from student1 where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		

	}

	@Override
	public void updateStudentClassName(Student stu) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(Student stu) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectStudent(Student stu) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> selectAllStudent() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
