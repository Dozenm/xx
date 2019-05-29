package Liu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Rand1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf=new RandomAccessFile("d:/rand.txt","rw");
		for(int i=0;i<10;i++) {
			raf.writeLong(10*i);
		}
		raf.seek(3*8);
		raf.writeLong(123);
		raf.seek(0);
		for(int i=0;i<10;i++) {
			System.out.println(raf.readLong());
		}

	}

}
