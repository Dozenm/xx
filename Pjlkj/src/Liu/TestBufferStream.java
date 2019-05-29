package Liu;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestBufferStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os=new FileOutputStream("d:/buffer.txt");
		BufferedOutputStream bos=new BufferedOutputStream(os);
		bos.write(65);
		bos.flush();
		bos.close();
		InputStream is=new FileInputStream("d:/buffer.txt");
		System.out.println((char)is.read());
	}

}
