package ten;

import java.util.ArrayList;
import java.util.Collections;

public class KeTangYanShi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		ArrayList li =new ArrayList();
		double array[]= {6,12,565,12};
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
			li.add(array[i]*10);
			
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
//		Collections.copy(list, li);
		Collections.reverse(list);
		System.out.println(list);
//		System.out.println(li);

	}

}
