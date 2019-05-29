package ten;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		Bank b1=new Bank(213,"zhangsan",4560);
		Bank b2=new Bank(789,"lisi",7894);
		m.put(1, b1);
		m.put(2,b2);
		System.out.println(m.get(1));
		System.out.println(b1.getBalance());

	}

}
class Bank{
	private int id;
	private String name;
	private double balance;
	public Bank(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
