package xiancheng;

public class KeHou2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread5 r1=new Thread5();
		Thread6 r2=new Thread6();
		Thread7 r3=new Thread7();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();

	}

}
class Thread5 implements Runnable{
	public void run() {
		for(int i=1;i<1000;i++) {
			int m=0;
			for(int j=1;j<=(i/2);j++) {
				if(i%j==0) {
					m++;
				}
			}
			if(m==1) {
				System.out.println("1~1000的数数:"+i);
			}
		}
	}
}
class Thread6 implements Runnable{
	public void run() {
		for(int i=1000;i<2000;i++) {
			int m=0;
			for(int j=1;j<=(i/2);j++) {
				if(i%j==0) {
					m++;
				}
			}
			if(m==1) {
				System.out.println("1000~2000的数数:"+i);
			}
		}
	}
}
class Thread7 implements Runnable{
	public void run() {
		for(int i=2000;i<3000;i++) {
			int m=0;
			for(int j=1;j<=(i/2);j++) {
				if(i%j==0) {
					m++;
				}
			}
			if(m==1) {
				System.out.println("2000~3000的数数:"+i);
			}
		}
	}
}