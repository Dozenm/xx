package ten;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class KeTangLianXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		LinkedList<String> ll=new LinkedList();
		al.add("2");
		al.add("asdad");
		ll.add("jll");
		ll.add("456");
		System.out.println(al);
		for(String i1:al) {
			System.out.print(i1);
			}
		for(int i = 0;i<al.size();i++) {
			System.out.print(al.get(i));
		}
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		//linked
		System.out.println(ll);
		for(String i1:ll) {
			System.out.print(i1);
			}
		for(int i = 0;i<ll.size();i++) {
			System.out.print(ll.get(i));
		}
		Iterator lt=ll.iterator();
		while(lt.hasNext()){
			System.out.print(lt.next());
		}

	}

}
