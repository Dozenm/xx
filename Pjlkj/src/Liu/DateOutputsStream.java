package Liu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DateOutputsStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os=new FileOutputStream("d:/datetest.txt");
		
		DataOutputStream dos=new DataOutputStream(os);
		String str="affffef";
		byte b=127;
		short s=123;
		int i=456;
		long l=456;
		double d=56;
		boolean t=true;
		dos.writeUTF(str);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeDouble(d);
		dos.writeBoolean(t);
		dos.close();
		FileInputStream is=new FileInputStream("d:/datetest.txt");
		DataInputStream dis=new DataInputStream(is);
		System.out.println(dis.readUTF());
		
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
	}

}
