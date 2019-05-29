package seven;

public class KeHou2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle V1=new Vehicle("benz","blaack");
		V1.run();
		Car c1=new Car("Honda","red",2);
		c1.run();
		

	}

}
class Vehicle{
	private String brand;
	private String color;
	private double speed;
	public Vehicle(){}
	public Vehicle(String brand,String color) {
		this.brand=brand;
		this.color=color;
		this.speed=0;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getBrand() {
		return brand;
	}
	public void run() {
		System.out.println(brand+" "+color+"Æû³µ±¼ÅÜ");
	}
}
class Car extends Vehicle{
	private int loader;
	public Car(String brand,String color,int loader) {
		super(brand,color);
		this.loader=loader;
	}
	public void run() {
		System.out.println(super.getBrand()+","+super.getColor()+","+loader+"½Î³µ±¼ÅÜ");
	}

}
