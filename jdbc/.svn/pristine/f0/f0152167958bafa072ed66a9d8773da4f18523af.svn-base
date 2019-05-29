package dao;

import java.sql.SQLException;
import java.util.List;

import student.Student;

public interface IDao {
	//增加学生
	void addStudent(Student stu)throws SQLException;
	//删除学生，根据id删
	void delectStudent(int id)throws SQLException;
	//更新学生班级信息
	void updateStudentClassName(Student stu)throws SQLException;
	//更新学生
	void updateStudent(Student stu)throws SQLException;
	//查询单个学生
	void selectStudent(Student stu)throws SQLException;
	//查询所有学生
	List<Student> selectAllStudent()throws SQLException;

}
