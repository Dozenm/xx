package seven;

public class Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1=new Car1();
		c1.money(3);

	}
}
interface Person{
	void money(double hour);
}
class Car1 implements Person{
	public void money(double hour) {
		System.out.println("收费"+15*hour);
	}
}
class Car2 implements Person{
	public void money(double hour) {
		System.out.println("收费"+10*hour);
	}
}
class Car3 implements Person{
	public void money(double hour) {
		System.out.println("收费"+5*hour);
	}
}
