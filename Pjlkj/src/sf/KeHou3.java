package sf;

public class KeHou3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer('ºÚ',3);
		c.shuChu();
		

	}

}
class Computer{
	private char color;
	private int cpu;
	public Computer() {
		
	}
	public Computer(char color,int cpu) {
		this.color=color;
		this.cpu=cpu;
	}
	public void shuChu() {
		System.out.println(color+","+cpu);
	}
	
}
