package wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestJie {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("127.0.0.1",8789);
		Thread t1=new ShuChu2(s); 
//		OutputStream os=s.getOutputStream();
		//ʵ��ͨ��

		
//		Writer w=new OutputStreamWriter(os);
		
//		PrintWriter pw=new PrintWriter(w);
//		System.out.println(br.readLine());
		//��׼����������
//		InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader br1=new BufferedReader(isr);
		while(true) {
			InputStream is=s.getInputStream();
			Reader r=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(r);
//			String temp1=br1.readLine();
//			pw.println(temp1);
//			pw.flush();
//			if(temp1.equals("bye")) {
//				break;
//				}
			String temp=br.readLine();
			System.out.println(temp);
		
//		s.close();
		}
//		is.close();br.close();
//		br1.close();
//		pw.close();
		
		

	}

}
class ShuChu2 extends Thread{
	private Socket s;
	public ShuChu2(Socket s) {
		// TODO Auto-generated constructor stub
		this.s=s;
	}
	public void run() {
		try {
//			InputStream is=s.getInputStream();
		OutputStream os=s.getOutputStream();
//		Reader r=new InputStreamReader(is);
		Writer w=new OutputStreamWriter(os);
//		BufferedReader br=new BufferedReader(r);
		PrintWriter pw=new PrintWriter(w);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader sbr=new BufferedReader(isr);
		String jk=sbr.readLine();
		pw.println(jk);pw.flush();
//		pw.close();
//		sbr.close();
//		isr.close();w.close();os.close();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
}
