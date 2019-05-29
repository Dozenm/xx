package Liu;

import java.io.File;
import java.io.FileFilter;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("e:\\");
		getFiles(f);
//		System.out.println(files[i]);

	}


public static void getFiles(File f) {
		File[] files=f.listFiles(new guolv());
			for(int i=0;i<files.length;i++) {
				if(files[i].isFile()) {
					System.out.println("�ļ�:"+files[i]);
					
				}else getFiles(files[i]);		
		}
	}
}
class guolv implements FileFilter{

	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		if(f.isDirectory())return true;
		String p=f.getName();
		if(p.indexOf(".exe")==-1)return false;
		else return true;
	}
}
