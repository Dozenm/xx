package Liu;

import java.io.File;
import java.nio.file.Files;

import javax.print.attribute.standard.Copies;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\�½��ļ��� (3)\\�½��ļ���";
		String path1="D:\\�½��ļ��� (3)\\�½��ļ���(2)";
		File file=new File(path);
		File file1=new File(path1);
//		Files c=new Files();
		Files.copy(file1,file);
//		System.out.println(file);

	}
//	public static void copy() {
////		File file=new File(path);
//	}
}
//class copy2 extends Copy{}

