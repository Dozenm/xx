package Liu;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestArrayStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] a=getBytes(811);
		ByteArrayInputStream bais=new ByteArrayInputStream(a);
		int i=0;
		while((i=bais.read())!=-1) {
			System.out.println(i);
		}

	}
	public static byte[] getBytes(long l) throws IOException {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		dos.writeLong(l);
		return baos.toByteArray();
		}

}
