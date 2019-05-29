package xiancheng;

class Test4 implements Runnable{
//	Test3 t3=new Test3();
	public void Thread1() throws InterruptedException{
		int i=0;
		
			synchronized(this) {
				i++;
				System.out.println("run"+i);
				Thread.sleep(5000);
			
		}
	}
public void Thread2(){
	int i=0;
	
		i++;
		System.out.println("t2"+i);
	
}

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		Thread1();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread2();
	
}



}
public class Test3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test4 t3=new Test4();
		Thread td1=new Thread(t3);
		Thread td2=new Thread(t3);
		td1.start();
		td2.start();
		

	}
}


