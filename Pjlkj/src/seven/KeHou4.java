package seven;

public class KeHou4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1=new Company();
		c1.sal();

	}

}
class ColaEmployee{
	private String name;
	private int month;
	public ColaEmployee(){}
	public ColaEmployee(String name,int month) {
		this.month=month;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	public double getSalary(int month) {
		return 0;
	}
}
class SalariedEmployee extends ColaEmployee{
	private double salary;
	public SalariedEmployee(String name, int month,double salary) {
		super(name, month);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	public double getSalary(int month) {
		if(getMonth()==month) {
			return salary+100;
		}else {
			return salary;
		}
		
	}

}
class HourlyEmployee extends ColaEmployee{
	private int hoursal;
	private int hourmonth;

	public HourlyEmployee(String name, int month,int hoursal,int hourmonth) {
		super(name, month);
		this.hourmonth=hourmonth;
		this.hoursal=hoursal;
		// TODO Auto-generated constructor stub
	}
	public double getSalary(int month) {
		return hoursal*160+(hourmonth-160)*hoursal*1.5;
		}
}
class SalasEmployee extends ColaEmployee{
	private double monthsala;
	private double tic;

	public SalasEmployee(String name, int month,double monthsala,double tic) {
		super(name, month);
		this.monthsala=monthsala;
		this.tic=tic;
		// TODO Auto-generated constructor stub
	}
	public double getSalary(int month) {
		return monthsala*tic;
		
	}
}class Company extends ColaEmployee{
	public Company() {}
	public Company(String name, int month) {
		super(name, month);
		// TODO Auto-generated constructor stub
	}

	public void sal() {
		SalasEmployee c1=new SalasEmployee("zahnfsan",3,123,1);
		HourlyEmployee  c2=new HourlyEmployee("lisi",4,56,45);
		SalariedEmployee c3=new SalariedEmployee("wangwu",5,564);
		
		ColaEmployee coloemployee[]=new ColaEmployee[3];
		coloemployee[1]=c1;
		coloemployee[0]=c2;
		coloemployee[2]=c3;
		for(int i=0;i<3;i++) {
			System.out.println(coloemployee[i].getName()+"的"+coloemployee[i].getMonth()+"月工资:"+coloemployee[i].getSalary(5));
		}
	}
}
