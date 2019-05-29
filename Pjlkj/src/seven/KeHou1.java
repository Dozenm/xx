package seven;

public class KeHou1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players.Xh();

	}

}
class Players{
	private static int sum;
	public Players(){
		sum++;
	}
	public static Players create(){
		Players p=null;
//		System.out.println("创建了一个对象");
		if(sum<11) {
			p=new Players();
		}else p=null;
		return p;
	}
	public static void Xh(){

		for(int i=0;i<12;i++) {
			System.out.println(Players.create());
		}
	}
}
