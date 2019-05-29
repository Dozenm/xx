package eight;

import java.util.Scanner;

public class KeHou1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		try {
			System.out.println(a/b);
		}catch(Exception e){
//			System.out.println("一场");
			e.printStackTrace();
		}finally{
			System.out.println("总是被执行");
		}

	}

}
