package sf;

import java.util.Random;

public class Ff {

	public static void main(String[] args) {
		Ff h=new Ff();
		int w= 0;
		h.hello();
		System.out.println(h.li(new Random().nextInt(),new Random().nextInt()));
//		h.li(new Random().nextInt(),new Random().nextInt());
		Kli p=new Kli();
		p.sum(2, 3);

		}
		public  void hello(){
		System.out.println("hello");
	}
		public int li(int h,int m){
			int w=0;w=h+m;
			System.out.println(w);
			return w;
		}
}
class Kli{
	public void sum(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
}
