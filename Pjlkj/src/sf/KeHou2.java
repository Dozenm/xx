package sf;

public class KeHou2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rt=new Rectangle(5, 6); 
		rt.getArea();
		rt.getPer();
		rt.showAll();

	}

}
class Rectangle{
	private int length;
	private int width;
	public Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public void getArea() {
		System.out.println(width*length);
	}
	public void getPer() {
		System.out.println((width+length)*2);
	}
	public void showAll() {
		System.out.println(width+","+length);
	}
}
