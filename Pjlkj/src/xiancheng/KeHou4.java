package xiancheng;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KeHou4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		while(true) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd a hh:mm:ss S");
		System.out.println(sdf.format(new Date()));
		Thread.sleep(1000);
//		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		}
	}

}

