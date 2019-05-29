package Liu;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPiped {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedOutputStream pos=new PipedOutputStream();
		PipedInputStream pis=new PipedInputStream();
		pis.connect(pos);
		Thread t=new PipedOutStream(pos);
		Thread d=new InStream(pis);
		t.start();
		d.start();

	}

}
class PipedOutStream extends Thread{
	private PipedOutputStream pos;
	public PipedOutStream(PipedOutputStream pos){
		this.pos=pos;
	}
	public void run() {
		String str="afka sakdj";
		 try {
			pos.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}class InStream extends Thread{
	private PipedInputStream pis;
	public InStream(PipedInputStream pis) {
		this.pis=pis;
	}
	public void run(){
		byte[] bs=new byte[100]; 
		int len=0;
		try {
			len=pis.read(bs);
			System.out.println(new String(bs,0,len));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
