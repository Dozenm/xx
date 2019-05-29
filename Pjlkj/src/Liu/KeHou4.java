package Liu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class KeHou4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("d:/obj.txt");
		ObjectOutputStream bos=new ObjectOutputStream(fos);
		Teacher t=new Teacher("ashdja",45);
		Student s1=new Student(12,"zhang","456",t);
		Student s2=new Student(12,"zlig","456",t);
		bos.writeObject(s1);
		bos.writeObject(s2);
		bos.close();
		FileInputStream fis=new FileInputStream("d:/obj.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
//		Student s0=null;
//		while((s0=(Student) ois.readObject())!=null)
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		

	}

}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	transient private String birth;
	private Teacher t;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth +",teacher"+t+ "]";
	}
	public Student(int id,String name,String birth,Teacher t) {
		super();
		this.id=id;
		this.name=name;
		this.birth=birth;
		this.t=t;
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}
class Teacher implements Serializable{
	private String name;
	private int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teahter [name=" + name + ", age=" + age + "]";
	}
}
