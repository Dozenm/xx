package xiancheng;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread a=new TestThread();
		a.start();
		for(int i=0;i<10;i++) {
			System.out.println("main"+i);
		}

	}

}
class TestThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run"+i);
		}
	}
}
