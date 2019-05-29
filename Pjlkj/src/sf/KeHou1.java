package sf;

public class KeHou1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point(20,20);
		p1.movePoint(20, 20);
		p2.movePoint(20, 20);

	}

}
class Point{
	private int x;
	private int y;
	public Point() {
		
	}
	public Point(int x0,int y0) {
		this.x=x0;
		this.y=y0;
	}
	public void movePoint(int dx,int dy) {
		this.x+=dx;
		this.y+=dy;
		System.out.println("x="+x+",y="+y);
	}
}
