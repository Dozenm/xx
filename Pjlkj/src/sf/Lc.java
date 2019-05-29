package sf;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Double.NEGATIVE_INFINITY;
public class Lc {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		int a=10;
//		if(a%2==0) {
//			System.out.println(a+",输入的值为偶数");
//		}else {
//			System.out.println(a);
//		}
		
		
//		int a=45327;
//		if(a%13==0) {
//			System.out.println("该数能被13整除");
//		}else {
//			System.out.println("该数不能被13整除");
//		}
//		if(a%17==0) {
//			System.out.println("该数能被13整除");
//		}else {
//			System.out.println("该数不能被17整除");
//		}
		
//		int a=5;
//		int b=8;
//		if(a<b) {
//			System.out.println(b);
//		}else {
//			System.out.println(a);
//		}
		
//		int a=2064;
//		if(a%400==0) {
//			System.out.println("闰年");
//		}
//		else if(a%100==0 && a%400!=0) {
//			System.out.println("不是闰年");
//		}
//		else if(a%4==0 && a%100!=0) {
//			System.out.println("闰年");
//		}else {
//			System.out.println("不是闰年");
//		}
//		

//		int a=new Scanner(System.in).nextInt();
//		if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12) {
//			System.out.println("改约天数为：31");
//		}
//		else if(a==2) {
//			System.out.println("改约天数为：28");
//		}
//		else if(a==4 || a==6 || a==9 || a==11) {
//			System.out.println("改约天数为：30");
//		}else {
//			System.out.println("天数错误");
//		}
		
//		switch(a){
//		case 1:System.out.println("改约天数为31");break;
//		case 2:System.out.println("改约天数为28");break;
//		case 3:System.out.println("改约天数为31");break;
//		case 4:System.out.println("改约天数为30");break;
//		case 5:System.out.println("改约天数为31");break;
//		case 6:System.out.println("改约天数为30");break;
//		case 7:System.out.println("改约天数为31");break;
//		case 8:System.out.println("改约天数为31");break;
//		case 9:System.out.println("改约天数为30");break;
//		case 10:System.out.println("改约天数为31");break;
//		case 11:System.out.println("改约天数为30");break;
//		case 12:System.out.println("改约天数为31");break;
//		default:System.out.println("输入错误");break;
//		}
		
//		System.out.print("请输入要购买的可乐:");
//		String c=new Scanner(System.in).nextLine();
//		String b="可乐";
//		if(c.equals(b)) {
//			System.out.println("可乐：2.5");
//		}
//		
//		int a=new Random().nextInt(12);
//		switch(a+1){
//		case 1:System.out.println("1约天数为31");break;
//		case 2:System.out.println("2约天数为28");break;
//		case 3:System.out.println("3约天数为31");break;
//		case 4:System.out.println("4约天数为30");break;
//		case 5:System.out.println("5约天数为31");break;
//		case 6:System.out.println("6约天数为30");break;
//		case 7:System.out.println("7约天数为31");break;
//		case 8:System.out.println("8约天数为31");break;
//		case 9:System.out.println("9约天数为30");break;
//		case 10:System.out.println("10约天数为31");break;
//		case 11:System.out.println("11约天数为30");break;
//		case 12:System.out.println("12约天数为31");break;
//		default:System.out.println("输入错误");break;
//		}
		
//		int a=new Random().nextInt(12);
//		int b=new Random().nextInt(30);
//		int num=0;
//		int c[]= {31,28,31,30,31,30,31,31,30,31,30,31};
//		for(int i=0;i<a;i++) {
//			 num=c[i]+num;
//		}
//		num=b+1+num;
//		System.out.println(a+1+"月"+(b+1)+"日"+num);
		
//		int sum=0;
//		int i=1;
//		while(i<=100) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		int i=1;
//		while(i<=100) {
//			sum+=i;
//			i+=2;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		int i=1;
//		do {
//			sum+=i;
//			i++;
//		}while(i<=100);
//		System.out.println(sum);
		
//		int sum=0;
//		for(int i=1;i<=100;i+=2) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		int a=0;
//		int sum=0;
//		for(int i=1;i<6;i++) {
//			a=new Scanner(System.in).nextInt();
//			sum+=a;
//		}
//		System.out.println(sum);
		
//		int a=new Random().nextInt(10);
//		int b=new Scanner(System.in).nextInt();
//		int c=new Scanner(System.in).nextInt();
//		int d=new Scanner(System.in).nextInt();
//		if(b==a || c==a || d==a) {
//			System.out.println("猜对了");
//		}else {
//			System.out.println("没猜对");
//		}
		
//		int a=new Scanner(System.in).nextInt();
//		int i=a/10;
//		int j=a%10;
//		if(i==0 || (i==1 && j==0)) {
//			System.out.println("应发放奖金:"+a*0.1);
//		}
//		else if((i==1 && j!=0) || (i==2 && j==0)) {
//			System.out.println("应发放奖金:"+(1+(a-10)*0.075));
//		}
//		else if((i==2 && j!=0) || i==3 || (i==4 && j==0)) {
//			System.out.println("应发放奖金:"+(1+0.75+(a-20)*0.05));
//		}
//		else if((i==4 && j!=0) || i==5 || (i==6 && j==0)) {
//			System.out.println("应发放奖金:"+(1+0.75+1+(a-40)*0.03));
//		}
//		else if((i==6 && j!=0) || i==7 || i==8 || i==9 || (i==10 && j==0)) {
//			System.out.println("应发放奖金:"+(1+0.75+0.6+(a-60)*0.015));
//		}
//		else if((i==10 && j!=0) || i>10) {
//			System.out.println("应发放奖金:"+(1+0.75+0.6+0.6+(a-100)*0.01));
//		}
		
//		int a=new Scanner(System.in).nextInt();
//		int i=a/10;
//		switch(i) {
//		case 9:System.out.println("A");
//		case 10:System.out.println("A");
//		case 8:System.out.println("B");
//		case 7:System.out.println("C");
//		case 6:System.out.println("D");
//		case 4:case 5: case 3: case 2: case 1: case 0:System.out.println("E");
//		}
		
//		int a=new Scanner(System.in).nextInt();
//		if(a%2==0) {
//			System.out.println("偶数");
//		}else {
//			System.out.println("技术");
//		}
		
//		int a=new Scanner(System.in).nextInt();
//		if(a==1) {
//			System.out.println("x=1");
//		}
//		else if(a==5){
//			System.out.println("x=5");
//		}
//		else if(a==10) {
//			System.out.println("x==10");
//		}else {
//			System.out.println("x=none");
//		}
		
//		int a=new Scanner(System.in).nextInt();
//		if(a%5==0 && a%6==0) {
//			System.out.println("能被5和6整除");
//		}
//		else if(a%5==0 && a%6!=0) {
//			System.out.println("能被5整除");
//		}
//		else if(a%5!=0 && a%6==0) {
//			System.out.println("能被6整除");
//		}else {
//			System.out.println("不能被5和6整除");
//		}
		
//		System.out.print("x=");
//		int x=new Scanner(System.in).nextInt();
//		System.out.print("y=");
//		int y=new Scanner(System.in).nextInt();
//		System.out.print("z=");
//		int z=new Scanner(System.in).nextInt();
//		int m=0;
//		if(x<y) {
//			m=x;
//			x=y;
//			y=m;
//		}
//		if(y<z) {
//			m=y;
//			y=z;
//			z=m;
//		}
//		if(x<y) {
//			m=x;
//			x=y;
//			y=m;
//		}
//		System.out.println(x+","+y+","+z);
		
//		System.out.println("请输入一个五位以内数:");
//		int a=new Scanner(System.in).nextInt();
//		if(a/10000!=0) {
//			System.out.println("5位数");
//			System.out.println("万位"+a/10000);
//			System.out.println("千位"+a%10000/1000);
//			System.out.println("百位"+a%1000/100);
//			System.out.println("十位"+a%100/10);
//			System.out.println("个位"+a%10);
//		}
//		else if(a/10000==0 && a/1000!=0) {
//			System.out.println("4位数");
//			System.out.println("千位"+a/1000);
//			System.out.println("百位"+a%1000/100);
//			System.out.println("十位"+a%100/10);
//			System.out.println("个位"+a%10);
//		}
//		else if(a/1000==0 && a/100!=0) {
//			System.out.println("3位数");
//			System.out.println("百位"+a/100);
//			System.out.println("十位"+a%100/10);
//			System.out.println("个位"+a%10);
//		}
//		else if(a/100==0 && a/10!=0) {
//			System.out.println("2位数");
//			System.out.println("十位"+a/10);
//			System.out.println("个位"+a%10);
//		}
//		else if(a/10==0) {
//			System.out.println("1位数");
//			System.out.println("个位"+a);
//		}
		
//		int a[]= {1,2,3,4,5};
//		int b[]= {6,7,8};
//		int c[]=new int[8];
//		System.arraycopy(a, 0, c, 0, a.length);
//		System.arraycopy(b, 0, c, 5, b.length);
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]);
//		}
		
		
//		double a[][]=new double[4][6];
//		double max=NEGATIVE_INFINITY;
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<6;j++) {
//				a[i][j]=new Random().nextInt();
//				System.out.println(a[i][j]);
//				if(a[i][j]>max) {
//					max=a[i][j];
//				}
//			}
//		}
//			System.out.println("max:"+max);

		
		
//		int  a[]= {10,20,30,40,50};
//		for(int i=0;i<5;i++) {
//			System.out.println(a[i]);
//		}
//		
//		char a[]= {'n','e'};
//		char b[]=a.clone();
//		System.out.println(b[0]);
//		System.out.println(b[1]);
		
//		int a[]= {1,6,2,3,9,4,5,7,8};
//		int b=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length-i-1;j++) {
//				if(a[j]<a[j+1]) {
//					b=a[j];
//					a[j]=a[j+1];
//					a[j+1]=b;
//				}
//			}
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		double a[][]= {{1.2,2.3,7.7,8.8},{4,5,6,8},{4,8,5,1},{4,7,8,5},{5,8,5,2}};
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
//		int a[]= {18,25,7,36,13,2,89,63};
//		int b=a[0];
//		int h=0;
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>b) {
//				b=a[i];
//			}
//			if(b==a[i]) {
//				h=i;
//			}
//		}
//		System.out.println(b);
//		System.out.println(h);
		
//		int a[][]= {{2,3,4},{4,6,8}};
//		int b[][]= {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
//		int c[][]=new int[2][4];
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<4;j++) {
//				for(int m=0;m<3;m++) {
//				c[i][j]+=a[i][m]*b[m][j];
//				}
//				System.out.println(c[i][j]);
//			}
//		}
		
//		int a[]= {1,2,3,4};
//		int b[]=new int[4];
//		for(int i=0;i<4;i++) {
//			b[3-i]=a[i];
//		}
////		for(int i=0;i<4;i++) {
////			System.out.println(b[i]);
////		}
		
		
//		int a[]= {1,2,4,3,1,2,3};
//		for(int i=0;i<a.length;i++) {
//			for(int j=i;j<a.length-1;j++) {
//				if(a[i]==a[j+1]) {
//					a[j+1]=0;
//				}
//				
//			}
//			System.out.println(a[i]);
//		}
	
	}

}
