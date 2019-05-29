package Liu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os=new FileOutputStream("d:/readwrite.txt",true);
		String str="rthrhrthrhr";
		byte[] as=str.getBytes();
		os.write(as);
//		os.close();
		InputStream is=new FileInputStream("d:/readwrite.txt");
//		int i=0;
//		while((i=is.read())!=-1){
//		System.out.print((char)i);
//		}
//		is.close();
		byte[] bs= new byte[5];
		int i=0;
		String temp="";
		while((i=is.read(bs))!=-1) {
			/*for(int j=0;j<i;j++) {
				System.out.print((char)bs[j]);
			}*/
			if(i!=-1) {
				temp=temp+new String(bs,0,i);
			}
			
		}
		System.out.print(temp);
//		is.close();

	}

}
