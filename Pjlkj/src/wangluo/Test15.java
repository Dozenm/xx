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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Test15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket ss=new ServerSocket(8789);
		int clientnum = 1;
		while(true) {
			Socket s=ss.accept();
			
			Thread t1=new ServerThrea(s,clientnum++);
			Thread t2=new ShuChu(s);
			t2.start();
			t1.start();
		}
		
		
//		System.out.println(15454);
		//ʵ��ͨ��
		
	}
}
class ServerThrea extends Thread{
	private Socket s;
//	private static ArrayList<Object> al=new ArrayList<Object>();
	private int clientnum;
	public ServerThrea(Socket s, int clientnum) {
		super();
		this.s = s;
//		al.add(s);
		this.clientnum = clientnum;
	}
	public void run(){
		try {
			InputStream is=s.getInputStream();
//			OutputStream os=s.getOutputStream();
			Reader r=new InputStreamReader(is);
//			Writer w=new OutputStreamWriter(os);
			BufferedReader br=new BufferedReader(r);
//			PrintWriter pw=new PrintWriter(w);
//			InputStreamReader isr=new InputStreamReader(System.in);
//			BufferedReader sbr=new BufferedReader(isr);
			while(true) {
				String jieshou=br.readLine();
				System.out.println("client"+clientnum+":"+jieshou);
				if(jieshou.equals("bye")) {
					break;
					}
//				for(Object x:al) {
//				String jk=sbr.readLine();
//					pw.println(jk);pw.flush();
//				}
				
				
			}
//			pw.close();
//			br.close();
//			s.close();
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
class ShuChu extends Thread{
	private Socket s;
	public ShuChu(Socket s) {
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