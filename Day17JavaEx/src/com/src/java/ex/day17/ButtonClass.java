package com.src.java.ex.day17;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ButtonClass extends JFrame implements ActionListener{
	JFrame f;
    JButton btn,btn1;
    JLabel l1;
ButtonClass()
{
	f=new JFrame();
	btn=new JButton("Red");
	btn1=new JButton("Blue");
	l1=new JLabel();
	
	f.setLayout(new FlowLayout());
	f.add(btn);
	f.add(btn1);
	btn.addActionListener(this);
	btn1.addActionListener(this);
	f.add(l1);
	f.setSize(200,200);
	f.setVisible(true);
	f.show();
}
@Override
public void actionPerformed(ActionEvent e) {
	String s=e.getActionCommand();
	if(s.equals("Red"))
	{
		btn.setBackground(Color.red);
		l1.setText("Button is clicked");
		l1.setForeground(Color.red);
	}
	else if(s.equals("Blue"))
	{
		btn1.setBackground(Color.blue);
		l1.setText("Button is clicked");
		l1.setForeground(Color.blue);
	}
	else
	{
		l1.setText("Button is not working");
	}
}

}
