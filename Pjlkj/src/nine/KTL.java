package nine;

public class KTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f1=new Food("kele",23);
		Food f2=new Food("kele",25);
		Food f3=new Food("kele",23);
		if(f1.equals(f2)) {
			System.out.println("=");
		}else {
			System.out.println("budeng");
		}
		if(f1.equals(f3)) {
			System.out.println("=");
		}else {
			System.out.println(f1);
		}
		if(f1==f3) {
			System.out.println("=");
		}else {
			System.out.println("budeng");
		}

	}

}
class Food{
	private String name;
	private double much;
	public Food(String name,double much) {
		this.name=name;
		this.much=much;
	}
}