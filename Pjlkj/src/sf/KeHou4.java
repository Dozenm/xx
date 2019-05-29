package sf;

public class KeHou4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonCreate p1=new PersonCreate("zhangsan",3,5);
		PersonCreate p2=new PersonCreate("lisi",3,5);
		p1.sayHello();
		p2.sayHello();

	}

}
class Person{
	private String name;
	private int width;
	private int height;
	public Person(){
		
	}
	public Person(String name,int widtn,int height) {
		this.name=name;
		this.width=width;
		this.height=height;
	}
	public void sayHello(){
		System.out.println("hello,my name is xxx");
	}
}
class PersonCreate extends Person{
	public PersonCreate(String name, int width, int height) {
		// TODO Auto-generated constructor stub
	}
	

}
