package eight;

import java.util.Scanner;

public class KeHouX {

	public static void main(String[] args) throws ByteSizeException{
		// TODO Auto-generated method stub
		new ByteSizeException();
		try{
			test1();
		}catch(ByteSizeException e) {
			System.out.println(e+"输入的数字不是byte");
			throw new ByteSizeException();
		}
	
			
		
	}
	public static void test1()throws ByteSizeException {
	int a=new Scanner(System.in).nextInt();
	if(a<-128||a>127) {
		throw new ByteSizeException();
	}
}
}

class ByteSizeException extends Exception{
	

}
