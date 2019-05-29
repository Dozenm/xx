package seven;

public class KHX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArryStu s=new ArryStu();
		s.js();

	}

}
class Student{
	private String name;
	private int id;
	private char gerder;
	private int age;
	public Student() {}
	public Student(String name,int id,char gerder,int age) {
		this.name=name;
		this.id=id;
		this.gerder=gerder;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public char getGerder() {
		return gerder;
	}
	public int getAge() {
		return age;
	}
	public double getSum() {
		return 0;
		}
}
class English extends Student{
	private int talk;
	private double qz;
	private double qm;

	public English(String name, int id, char gerder, int age, double qz, double qm,int talk) {
		super(name, id, gerder, age);
		this.talk=talk;
		this.qm=qm;
		this.qz=qz;
		// TODO Auto-generated constructor stub
	}
	public double getSum() {
		return talk*0.5+qm*0.25+qz*0.25;
	}
}
class Computer extends Student{
	private int active;
	private double wenglish;
	private double qz;
	private double qm;

	public Computer(String name, int id, char gerder, int age, double qz, double qm,int active,double wenglish) {
		super(name, id, gerder, age);
		this.active=active;
		this.wenglish=wenglish;
		this.qm=qm;
		this.qz=qz;
		// TODO Auto-generated constructor stub
	}
	public double getSum() {
		return active*0.4+wenglish*0.2+qm*0.2+qz*0.2;
	}
}
class China extends Student{
	private int talk;
	private int work;
	private double qz;
	private double qm;
	public China() {}

	public China(String name, int id, char gerder, int age, double qz, double qm,int talk,int work) {
		super(name, id, gerder, age);
		this.talk=talk;
		this.work=work;
		this.qm=qm;
		this.qz=qz;
		// TODO Auto-generated constructor stub
	}
	public double getSum() {
		return talk*0.35+work*0.35+qm*0.15+qz*0.15;
	}
}
class ArryStu{
	public void js() {
		Student a[]=new Student[4];
		English stu1=new English("lisi", 13, 'f', 23, 56, 77, 88);
		China c=new China();
		a[0]=stu1;
		System.out.println(a[0].getAge());
	}
}