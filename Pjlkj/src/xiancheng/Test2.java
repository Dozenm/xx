package xiancheng;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestRunable tb=new TestRunable();
		Thread t=new Thread(tb);
		Thread t1=new Thread(tb);
		t.start();
		t1.start();
//		t.sleep(10000);
//		System.out.println(t.getPriority());
//		t.setPriority(10);
//		t.yield();
//		t.interrupt();
//		t.join(1);
//		System.out.println(t.isAlive());
//		for(int i=0;i<10;i++) {
//			System.out.println("main"+i);
//		}

	}
	

}
class  TestRunable implements Runnable{
private static int  i=0;

	public void run() {
		// TODO Auto-generated method stub
		 synchronized(this) {
		i++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("run"+i);
	}
		 for(int l=0;l<5;l++) {
			 System.out.println(l);
		 }
	}
}

