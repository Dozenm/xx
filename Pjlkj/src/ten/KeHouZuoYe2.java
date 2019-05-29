package ten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeHouZuoYe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in=" ";
		ArrayList<String> al=new ArrayList();
		while(!in.equals("close")) {
			in=new Scanner(System.in).nextLine();
			al.add(in);
			
		}
		Collections.sort(al);
		System.out.println(al);

	}

}
