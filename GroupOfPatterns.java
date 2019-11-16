import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GroupOfPatterns extends JFrame implements ActionListener
{
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;

	Pattern1 p1=new Pattern1();
	Pattern2 p2=new Pattern2();
	Pattern3 p3=new Pattern3();
	Pattern4 p4=new Pattern4();
	Pattern5 p5=new Pattern5();
	Pattern6 p6=new Pattern6();
	Pattern7 p7=new Pattern7();
	Pattern8 p8=new Pattern8();
	Pattern9 p9=new Pattern9();
	Pattern10 p10=new Pattern10();
	
	GroupOfPatterns()
	{
		setTitle("card game");
	setBounds(50,50,1000,1000);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setLayout(null);

		img1=new ImageIcon("icon1.jpg");
		img2=new ImageIcon("icon2.jpg");
		img3=new ImageIcon("icon3.jpg");
		img4=new ImageIcon("icon4.jpg");
		img5=new ImageIcon("icon5.jpg");
		img6=new ImageIcon("icon6.jpg");
		img7=new ImageIcon("icon7.jpg");
		img8=new ImageIcon("icon8.jpg");
		img9=new ImageIcon("icon9.jpg");
		img10=new ImageIcon("icon10.jpg");

		btn1=new JButton(img1);
		btn2=new JButton(img2);
		btn3=new JButton(img3);
		btn4=new JButton(img4);
		btn5=new JButton(img5);
		btn6=new JButton(img6);
		btn7=new JButton(img7);
		btn8=new JButton(img8);
		btn9=new JButton(img9);
		btn10=new JButton(img10);
		
		Container c=getContentPane();
		setLayout(new GridLayout(3,4));
		
		/*
		btn1.setBounds(50,50,img1.getIconWidth(),img1.getIconHeight());
		btn2.setBounds(150,50,img2.getIconWidth(),img2.getIconHeight());
		btn3.setBounds(170,50,img3.getIconWidth(),img3.getIconHeight());
		btn4.setBounds(230,50,img4.getIconWidth(),img4.getIconHeight());

		btn5.setBounds(50,110,img5.getIconWidth(),img5.getIconHeight());
		btn6.setBounds(110,110,img6.getIconWidth(),img6.getIconHeight());
		btn7.setBounds(170,110,img7.getIconWidth(),img7.getIconHeight());
		btn8.setBounds(230,110,img8.getIconWidth(),img8.getIconHeight());

		btn9.setBounds(110,170,img9.getIconWidth(),img9.getIconHeight());
		btn10.setBounds(170,170,img10.getIconWidth(),img10.getIconHeight());
		*/

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);

		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);
		c.add(btn9);
		c.add(btn10);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn1)
		{
			p1.setVisible(true);
			this.setVisible(false);
			
			
		}
		if(ae.getSource()==btn2)
		{
			p2.setVisible(true);
			this.setVisible(false);
			
			
		}
		if(ae.getSource()==btn3)
		{
			p3.setVisible(true);

			this.setVisible(false);
		}
		if(ae.getSource()==btn4)
		{
			p4.setVisible(true);

			
			this.setVisible(false);
		}
		if(ae.getSource()==btn5)
		{
			p5.setVisible(true);

			
			this.setVisible(false);
		}
		if(ae.getSource()==btn6)
		{
			p6.setVisible(true);


			this.setVisible(false);
		}
		if(ae.getSource()==btn7)
		{
			p7.setVisible(true);
	
			this.setVisible(false);
		}
		if(ae.getSource()==btn8)
		{
			p8.setVisible(true);
			
			this.setVisible(false);
		}
		if(ae.getSource()==btn9)
		{
			p9.setVisible(true);
			
			
			this.setVisible(false);
		}
		if(ae.getSource()==btn10)
		{
			p10.setVisible(true);
			
			this.setVisible(false);
		}

	}
	
}
