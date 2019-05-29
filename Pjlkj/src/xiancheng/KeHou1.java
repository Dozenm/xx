package xiancheng;

public class KeHou1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1=new Thread2();
		Thread3 t2=new Thread3();
		Thread4 t3=new Thread4();
		t1.start();
		t2.start();
		t3.start();

	}

}
class Thread2 extends Thread{
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
class Thread3 extends Thread{
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
class Thread4 extends Thread{
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