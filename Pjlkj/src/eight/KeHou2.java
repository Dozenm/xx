package eight;

public class KeHou2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			thw();
		}catch(NullPointerException e) {
			System.out.println(e);
		}

	}
	public static void thw()throws NullPointerException{
		String a="aasd";
		String b=null;
		if(a==null||b==null) {
			throw new NullPointerException();
		}
	}

}
