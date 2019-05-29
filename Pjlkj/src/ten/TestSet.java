package ten;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet();
		int b=0;
		for(int i=0;s.size()<7;i++) {
			Random a=new Random();
			b=a.nextInt(25);
			s.add(b);
			
		}
		System.out.println(s);
		for(int x:s) {
			System.out.print(","+x);
		}

	}

}

