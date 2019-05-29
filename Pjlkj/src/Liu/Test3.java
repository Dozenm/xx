package Liu;

import java.io.File;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		File f=new File("C:\\Users\\Administrator\\Desktop\\越超\\视频");
//		
//		f.createNewFile("d:\\aaa");
		Test9 t=new Test9();
		t.createF("laji","neirong");
		

	}

}
class Test9{
	private static String path="d:\\新建文件夹 (3)\\新建文件夹 (2)\\";
	private static String newfile;
	public static boolean createF(String filename,String filecontent) {
		boolean bool=false;
		newfile=path+filename+".txt";
		File f= new File(newfile);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		}

}
