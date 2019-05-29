package Liu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class KouHou3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("c:/text.txt");
		String str="hello world";
		byte[] a=str.getBytes();
		fos.write(a,0, a.length);
		fos.close();
		FileInputStream fis=new FileInputStream("c:/text.txt");
		int i=0;
		byte[] bs=new byte[100];
		if((i=fis.read(bs))!=-1) {
			for(int k=0;k<i;k++) {
			System.out.print((char)bs[k]);
			if(bs[k]==108) {
				bs[k]=76;
				
				}
			}
		}
		fis.close();
		
		FileOutputStream fos2=new FileOutputStream("c:/test.txt");
		
		fos2.write(bs,0,i);
		fos2.close();
		
	}

}
