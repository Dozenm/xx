package Gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Horse extends JPanel implements Runnable{
//	Test1 test1=new Test1();
	private int id;
	private Image image;
	private int xLocation;
	static int widId;
	public Horse(int id) {
		this.id=id;
		image=new ImageIcon("0055.gif").getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(image, xLocation, 0, image.getWidth(this), image.getHeight(this), this);
		System.out.println("渲染！"+xLocation);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(xLocation<625) {
			
			xLocation+=Math.random()*50;
			this.repaint();
//			System.out.println("dadsada"+xLocation);
			if(xLocation>=625) {
				System.out.println("dadsada"+xLocation);
				if(widId==-1) {
					widId=this.id;
					Test1.jta.append(id+"号马获胜");
					if(Test1.choseId==id) {
						Test1.jta.append("猜对了");
						Test1.i+=Test1.dumoney;
						Test1.money.setText("现有金额"+Test1.i);
					}else {
						Test1.jta.append("猜错了");
						Test1.i-=Test1.dumoney;
						Test1.money.setText("现有金额"+Test1.i);
					}
				}
			
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
	}
	

}
