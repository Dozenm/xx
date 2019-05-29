package ten;

import java.util.ArrayList;
import java.util.Collections;

public class KeHou3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		al.add("apple");
		al.add("grape");
		al.add("banana");
		al.add("pear");
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		Collections.sort(al);
		for(String x:al) {
			System.out.println(x);
		}

	}

}
