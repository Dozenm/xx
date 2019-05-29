package ten;

import java.awt.List;
import java.util.LinkedList;

public class KeHou1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList ll=new LinkedList();
//		String str=new String();
//		str="jlk";
//		ll.add(str);
//		ll.add(543);
//		System.out.println(ll.isEmpty());
//		System.out.println(ll.get(0));
//		ll.get(1);
//		System.out.println(ll.isEmpty());
//		System.out.println(ll);
		Linkeds lin=new Linkeds();
		String str1="jkl";
		String str2="ert";
		lin.put(str1);
		lin.put(str2);
		System.out.println(lin.isEmpty());
		System.out.println(lin.get());
		System.out.println(lin.get());
		System.out.println(lin.isEmpty());

	}

}
class Linkeds{

LinkedList l;
//构造方法
public Linkeds(){
    l=new LinkedList();
}
public void put(Object o){
	l.add(o);
}

public Object get(){
	Object o=l.get(0);
	l.remove(0);
	return o;
}


public boolean isEmpty(){
	if(l.isEmpty()){
		return true;

		}
	return false;
	}
}
