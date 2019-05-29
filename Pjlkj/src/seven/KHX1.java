package seven;

import java.util.Scanner;

public class KHX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gardener g=new Gardener();
		g.kl();

	}

}
//interface JK{
//	
//}
class apple{
	public apple(){
		System.out.println("创建了一个苹果对象");
	}
}
class bannaner{
	public bannaner() {
		System.out.println("创建了一个香蕉对象");
	}
}
class putao {
	public putao() {
		System.out.println("创建了一个葡萄对象");
	}
}
class Gardener{
	public void kl() {
		Scanner a=new Scanner(System.in);
		String s="name";
		s=a.nextLine();
		if(s.equals("苹果")) {
			new apple();
		}else if(s.equals("香蕉")) {
			new bannaner();
		}else if(s.equals("葡萄")) {
			new putao();
		}
	}


}