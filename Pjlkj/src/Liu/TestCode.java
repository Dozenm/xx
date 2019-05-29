package Liu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("d:/qiao.txt");
		Writer w=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(w);
		bw.write("艾克九分裤\n");
		bw.write("艾克九分裤");
		bw.close();
		FileInputStream fis=new FileInputStream("d:/qiao.txt");
		Reader r=new InputStreamReader(fis);
		BufferedReader bir=new BufferedReader(r);
		String st=null;
		while((st=bir.readLine())!=null){
			System.out.println(st);
		}
		bir.close();
	}

}
