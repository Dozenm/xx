package Liu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d:\\新建文件夹 (3)\\12.txt");
		Path path=Paths.get("d:\\新建文件夹 (3)\\146\\125");
		File file1=new File("d:\\新建文件夹 (3)\\asf");
			System.out.println(path.getFileName());
			System.out.println(file.getName());
			System.out.println(path.getRoot());
			System.out.println(path.getParent());
			try {
				Files.createFile(Paths.get("d:\\新建文件夹 (3)\\147\\1111111.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Files.copy(file.toPath(),Paths.get("d:\\新建文件夹 (3)\\146\\189.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
//		System.out.println(file.exists());
////		file.delete();
//		System.out.println(file.canRead());]
//		System.out.println(file.canWrite());
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
//		file.renameTo(file1);
//		System.out.println(file.length());

	}

}
