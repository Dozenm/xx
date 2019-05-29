package xiancheng;

public class KeHou3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread10 t1=new Thread10();
		Thread10 t2=new Thread10();
		Thread10 t3=new Thread10();
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(2);
		t1.start();
		t2.start();
		t3.start();

	}

}
class Thread10 extends Thread{
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println(Thread.currentThread()+"正在运行");
		}
	}
}
