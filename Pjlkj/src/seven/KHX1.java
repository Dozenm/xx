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
		System.out.println("������һ��ƻ������");
	}
}
class bannaner{
	public bannaner() {
		System.out.println("������һ���㽶����");
	}
}
class putao {
	public putao() {
		System.out.println("������һ�����Ѷ���");
	}
}
class Gardener{
	public void kl() {
		Scanner a=new Scanner(System.in);
		String s="name";
		s=a.nextLine();
		if(s.equals("ƻ��")) {
			new apple();
		}else if(s.equals("�㽶")) {
			new bannaner();
		}else if(s.equals("����")) {
			new putao();
		}
	}


}