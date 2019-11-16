import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pattern6 extends JFrame implements ActionListener{
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,patterns;
	ImageIcon icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9;
		

	Pattern6()
	{
		setTitle("card game");
		setBounds(50,50,600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		icon1=new ImageIcon("img1.jpg");
		icon2=new ImageIcon("img2.jpg");
		icon3=new ImageIcon("img3.jpg");
		icon4=new ImageIcon("img4.jpg");
		icon5=new ImageIcon("img5.jpg");
		icon6=new ImageIcon("img6.jpg");
		icon7=new ImageIcon("img7.jpg");
		icon8=new ImageIcon("img8.jpg");
		icon9=new ImageIcon("img9.jpg");
		
		patterns=new JButton("PATTERNS");
	patterns.setBounds(450,50,100,30);
	patterns.addActionListener(this);

		
		btn1=new JButton(icon9);
		btn1.setBounds(100,100,icon1.getIconWidth(),icon1.getIconHeight());
		btn1.addActionListener(this);
		
		
		btn2=new JButton(icon7);
		btn2.setBounds(250,100,100,100);
		btn2.addActionListener(this);
		
		
		btn3=new JButton(icon5);
		btn3.setBounds(400,100,100,100);
		btn3.addActionListener(this);
		
		
		btn4=new JButton(icon8);
		btn4.setBounds(100,250,100,100);
		btn4.addActionListener(this);
		
		
		btn5=new JButton(icon6);
		btn5.setBounds(250,250,100,100);
		btn5.addActionListener(this);
		
		
		btn6=new JButton(icon1);
		btn6.setBounds(400,250,100,100);
		btn6.addActionListener(this);
		
		
		btn7=new JButton(icon4);
		btn7.setBounds(100,400,100,100);
		btn7.addActionListener(this);
		
		
		btn8=new JButton(icon3);
		btn8.setBounds(250,400,100,100);
		btn8.addActionListener(this);
		
		
		btn9=new JButton(icon2);
		btn9.setBounds(400,400,100,100);
		btn9.addActionListener(this);
		
		Container c=getContentPane();
		c.setBackground(Color.BLACK);
		
		c.add(patterns);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);
		c.add(btn9);
		
		setVisible(false);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn1)
		{
			if(btn2.getIcon()==icon9)
			{
			btn2.setIcon(btn1.getIcon());
			btn1.setIcon(icon9);
			}
			if(btn4.getIcon()==icon9)
			{
				btn4.setIcon(btn1.getIcon());
				btn1.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn2)
		{
			if(btn1.getIcon()==icon9)
			{
				btn1.setIcon(btn2.getIcon());
				btn2.setIcon(icon9);
			}
			if(btn3.getIcon()==icon9)
			{
				btn3.setIcon(btn2.getIcon());
				btn2.setIcon(icon9);
			}
			if(btn5.getIcon()==icon9)
			{
				btn5.setIcon(btn2.getIcon());
				btn2.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn3)
		{
			if(btn2.getIcon()==icon9)
			{
				btn2.setIcon(btn3.getIcon());
				btn3.setIcon(icon9);
			}
			if(btn6.getIcon()==icon9)
			{
				btn6.setIcon(btn3.getIcon());
				btn3.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn4)
		{
			if(btn1.getIcon()==icon9)
			{
				btn1.setIcon(btn4.getIcon());
				btn4.setIcon(icon9);
			}
			if(btn5.getIcon()==icon9)
			{
				btn5.setIcon(btn4.getIcon());
				btn4.setIcon(icon9);
			}
			if(btn7.getIcon()==icon9)
			{
				btn7.setIcon(btn4.getIcon());
				btn4.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn5)
		{
			if(btn2.getIcon()==icon9)
			{
				btn2.setIcon(btn5.getIcon());
				btn5.setIcon(icon9);
			}
			if(btn4.getIcon()==icon9)
			{
				btn4.setIcon(btn5.getIcon());
				btn5.setIcon(icon9);
			}
			if(btn6.getIcon()==icon9)
			{
				btn6.setIcon(btn5.getIcon());
				btn5.setIcon(icon9);
			}
			if(btn8.getIcon()==icon9)
			{
				btn8.setIcon(btn5.getIcon());
				btn5.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn6)
		{
			if(btn3.getIcon()==icon9)
			{
				btn3.setIcon(btn6.getIcon());
				btn6.setIcon(icon9);
			}
			if(btn5.getIcon()==icon9)
			{
				btn5.setIcon(btn6.getIcon());
				btn6.setIcon(icon9);
			}
			if(btn9.getIcon()==icon9)
			{
				btn9.setIcon(btn6.getIcon());
				btn6.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn7)
		{
			if(btn4.getIcon()==icon9)
			{
				btn4.setIcon(btn7.getIcon());
				btn7.setIcon(icon9);
			}
			if(btn8.getIcon()==icon9)
			{
				btn8.setIcon(btn7.getIcon());
				btn7.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn8)
		{
			if(btn5.getIcon()==icon9)
			{
				btn5.setIcon(btn8.getIcon());
				btn8.setIcon(icon9);
			}
			if(btn7.getIcon()==icon9)
			{
				btn7.setIcon(btn8.getIcon());
				btn8.setIcon(icon9);
			}
			if(btn9.getIcon()==icon9)
			{
				btn9.setIcon(btn8.getIcon());
				btn8.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==btn9)
		{
			if(btn6.getIcon()==icon9)
			{
			btn6.setIcon(btn9.getIcon());
			btn9.setIcon(icon9);
			}
			if(btn8.getIcon()==icon9)
			{
			btn8.setIcon(btn9.getIcon());
			btn9.setIcon(icon9);
			}
		}
		
		if(ae.getSource()==patterns)
	{
					this.setVisible(false);
		GroupOfPatterns gop=new GroupOfPatterns();
		gop.setVisible(true);

	}
	if(btn1.getIcon()==icon1&&btn2.getIcon()==icon2&&btn3.getIcon()==icon3&&btn4.getIcon()==icon4&&btn5.getIcon()==icon5&&btn6.getIcon()==icon6&&btn7.getIcon()==icon7&&btn8.getIcon()==icon8)
	{
		JOptionPane.showMessageDialog(Pattern6.this,"Complete!!!");
	}

	}


}
