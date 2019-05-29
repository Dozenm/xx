package seven;

public class KeHou3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5,6,"red");
		r.showAll();
		Circle c=new Circle(5,"blue");
		c.showAll();

	}

}
abstract class Shape{
	private double area;
	private double per;
	private String color;
	public Shape() {}
	public Shape(String color) {
		this.color=color;
	}
	public abstract void grtArea();
	public abstract double getPer();
	public abstract void showAll();
	public String getColor() {
		return color;
	}
}
class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(double width,double height,String color) {
		super(color);
		this.height=height;
		this.width=width;
	}

	@Override
	public void grtArea() {
		// TODO Auto-generated method stub
		System.out.println(width*height);
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		System.out.println(2*(width+height));
		return 0;
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		System.out.println(height+","+width+super.getColor());
	}}
class Circle extends Shape{
	private double radius;
	public Circle(double radius,String color) {
		super(color);
		this.radius=radius;
	}

	@Override
	public void grtArea() {
		// TODO Auto-generated method stub
		System.out.println(3.14*radius*radius);
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
//		System.out.println(2*radius*3.14);
		return 2*3.14;
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		System.out.println(getPer()+","+radius+","+super.getColor());
	}
	
}
