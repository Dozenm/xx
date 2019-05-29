package Liu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class InputerStream1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream s0=new FileOutputStream("D:\\新建文件夹 (3)\\146.txt");
		FileInputStream s1=new FileInputStream("D:\\新建文件夹 (3)\\146.txt");
//		s0.write('l');
		System.out.println((s1.read()));
		System.out.println((s1.read()));
//		s0.write('b');
//		Byte[] a={'j','k'};
//		int i=0;
//		while(a[i]!= null);{
//			i++;
//			s0.write(a[0]);
//			s0.write(a[1]);
//		}
		s1.close();

	}

}
