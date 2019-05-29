package Gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Test1 extends JFrame{
	static int choseId=0;
	static int i = 1000;
	static int dumoney;
	static JLabel money=new JLabel("现有金额"+i);
	static JTextArea jta=new JTextArea();
	
	public Test1() {

		this.setTitle("123");
		this.setResizable(true);
		setMinimumSize(new Dimension(800,500));
		setMaximumSize(new Dimension(800,500));
//		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container con=this.getContentPane();//获取当前容器
		con.setLayout(new GridLayout(2,1));//设置布局方式
		JPanel up=new JPanel();
		JPanel down=new JPanel();
//		up.setBackground(Color.red);
		up.setLayout(new GridLayout(4,1));
		con.add(up);
		con.add(down);
		Horse jp1=new Horse(1);
		Horse jp2=new Horse(2);
		Horse jp3=new Horse(3);
		Horse jp4=new Horse(4);
		up.add(jp1);
		up.add(jp2);
		up.add(jp3);
		up.add(jp4);
		down.setLayout(new GridLayout(2,1));
		JPanel d1=new JPanel();
		JPanel d2=new JPanel();
		down.add(d1);
//		down.add(d2);
		d1.setLayout(new GridLayout(1,4));
		JPanel dd1=new JPanel();
//		dd1.setBackground(Color.green);
		JPanel dd2=new JPanel();
//		dd2.setBackground(Color.red);
		JPanel dd3=new JPanel();
		JPanel dd4=new JPanel();
		d1.add(dd1);
		d1.add(dd2);
		d1.add(dd3);
		d1.add(dd4);
		JLabel jb=new JLabel("选择");
		dd1.add(jb);
		dd2.setLayout(new GridLayout(4,1));
		JRadioButton jrb1=new JRadioButton("于浩马");
		JRadioButton jrb2=new JRadioButton("于浩马");
		JRadioButton jrb3=new JRadioButton("于浩马");
		JRadioButton jrb4=new JRadioButton("于浩马");
		dd2.add(jrb1);
		dd2.add(jrb2);
		dd2.add(jrb3);
		dd2.add(jrb4);
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		dd3.add(money);
		dd4.setLayout(new GridLayout(4,1));
		JTextField input=new JTextField();
		
		JButton jb1=new JButton("开始");
		JButton jb2=new JButton("再来一次");
		JButton jb3=new JButton("退出");
//		dd4.add(money);
		dd4.add(input);
		dd4.add(jb1);
		dd4.add(jb2);
		dd4.add(jb3);
		
		JScrollPane jScrollPane= new JScrollPane(jta);
		down.add(jScrollPane);
		jrb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choseId=1;
				jta.append("选择了"+choseId+"号马\n");
			}
		});
jrb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choseId=2;
				jta.append("选择了"+choseId+"号马\n");
			}
		});
jrb3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		choseId=3;
		jta.append("选择了"+choseId+"号马\n");
	}
});
jrb4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		choseId=4;
		jta.append("选择了"+choseId+"号马\n");
	}
});
jb1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(choseId==0) {
		jta.append("选码");
		}else {
			if(input.getText().equals("")) {
				jta.append("加钱");
			}else {
				dumoney=Integer.parseInt(input.getText());
				if(dumoney>i||dumoney<0) {
					jta.append("金额有问题");
				}else {
					jta.append("开始比赛");
					jb1.setEnabled(false);
					input.setEditable(false);
					
					Thread t11=new Thread(jp1);
					Thread t22=new Thread(jp2);
					Thread t33=new Thread(jp3);
					Thread t44=new Thread(jp4);
					t11.start();
					t22.start();
					t33.start();
					t44.start();
					
				}
			}
		}
	}
});
jb2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		choseId=-1;
		Horse.widId=-1;
		bg.clearSelection();
		input.setText("");
		jb1.setEnabled(true);
		input.setEditable(true);
//		t1.setxLocation(0);
//		t2.setxLocation(0);
//		t3.setxLocation(0);
//		t4.setxLocation(0);
	}
});
jb3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
});
this.setVisible(true);
}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();

	}
	

}
