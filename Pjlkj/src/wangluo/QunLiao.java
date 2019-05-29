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

public class QunLiao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(8836);
		int clientnum = 1;
		ArrayList<Object> al=new ArrayList();
		while(true) {
			Socket s=ss.accept();
			al.add(s);
			Thread t1=new ServerThread(s,clientnum++);
			t1.start();
		}
		
		
//		System.out.println(15454);
		//实现通信
		
	}
}
class ServerThread extends Thread{
	private ArrayList<Socket> al=new ArrayList();
	private int clientnum;
	public ServerThread(Socket s, int clientnum) {
		super();
		al.add(s);
		this.clientnum = clientnum;
	}
	public void run(){
		try {
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			Reader r=new InputStreamReader(is);
			Writer w=new OutputStreamWriter(os);
			BufferedReader br=new BufferedReader(r);
			PrintWriter pw=new PrintWriter(w);
			while(true) {
				String jieshou=br.readLine();
				System.out.println("client"+clientnum+":"+jieshou);
				if(jieshou.equals("bye")) {
					break;
					}
				pw.println("server"+jieshou);
				pw.flush();
			}
			pw.close();
			br.close();
			s.close();
		}catch(Exception e) {
			e.getMessage();
		}
		
//		pw.println("你是一个傻逼");
//		pw.flush();
//		System.out.println(br.readLine());


	}
}