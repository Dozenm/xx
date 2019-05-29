package seven;

import sf.KeHou4;

public class KeTang1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		officer o1=new officer();
		o1.show();
		Person stu7=new Person();
		KeHou4 p5=new KeHou4();

	}

}
class Employee{
	public void show() {
		System.out.println("hello");
	}
}
class officer extends Employee{}
class Stu2 extends Person{}