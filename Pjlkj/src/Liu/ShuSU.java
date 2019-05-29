package Liu;

public class ShuSU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<1000;i++) {
			int m=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					m++;
				}
			}
			if(m==1) {
				System.out.println(i);
			}
		}

	}

}
