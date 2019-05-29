package sf;

import java.util.Scanner;

public class Jc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jc sun=new Jc();
//		sun.jcTest();
		sun.zS();


	}
//		public void jcTest(){
//			System.out.print("请输入一个整数:");
//			int n=new Scanner(System.in).nextInt();
//			int sum=1;
//			for(int i=1;i<=n;i++) {
//				sum=i*sum;
//			}
//			System.out.println(n+"的阶乘是:"+sum);
//			
//		}	
//		}
		public void zS() {
			int i=200;
			int n=1;
			
			for(i=200;;i++) {
				int m=0;
				for(n=2;n<i;n++) {
					
					if(i%n==0) {
						m++;
					}
				
				}
				if(m==0) {
					System.out.println(i);
					break;
				}
			}
		}
		
		
}

