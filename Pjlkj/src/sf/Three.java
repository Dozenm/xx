package sf;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanJiao.set(5, 6, 8);
		

	}

}
class SanJiao{
	private int a;
	private int b;
	private int c;
	public SanJiao(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void set(int a,int b,int c) {
		if(a>0&&b>0&&c>0) {
			if(a+b>c || a+c>b || b+c>a) {
				System.out.println(a+" "+b+" "+c);
			}else {
				System.out.println("你的三角形有问题");
			}
		}else {
			System.out.println("你的三角形有问题");
		}
	}
}
