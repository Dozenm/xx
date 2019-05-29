package sf;

public class KeHouX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("benz", "black", 0);
		v1.setColor("red");
		System.out.println(v1.getColor());
		v1.run();

	}

}
class Vehicle{
	private final String brand;
	private String color;
	private double speed;
	public Vehicle(String brand,String color,double speed) {
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
		System.out.println("Æû³µ±¼ÅÜ");
	}
	
}
