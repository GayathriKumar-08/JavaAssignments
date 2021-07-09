package com.src.java.ex.day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Radiobtn extends JFrame implements ActionListener {
	JButton b;
	JRadioButton rb1,rb2;    
	TextField tf1;
	Label l;
	Radiobtn()
	{
		rb1=new JRadioButton("Celsius");  
		rb1.setBounds(100,50,100,30);      
		rb2=new JRadioButton("Farenheit");    
		rb2.setBounds(100,100,100,30);   
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);    
		b=new JButton("click"); 
		
		l= new Label();
		tf1=new TextField(20);
		
		b.setBounds(100,150,80,30);    
		b.addActionListener(this);    
		
		setLayout(new GridLayout(3,2));
		add(rb1);
		add(rb2);
		add(tf1);
		add(l);
		add(b);    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(rb1.isSelected())
		{
			Float cel=Float.parseFloat(tf1.getText());
			Float fah =((cel*9)/5)+32;  
	        l.setText("Result: "+fah);
		}
		else
		{
			Float fah=Float.parseFloat(tf1.getText());
			Float cel =(fah-32)*5/9;  
	        l.setText("Result: "+cel);
		}
		
	}
	
	public static void main(String args[])
	{
		Radiobtn rb=new Radiobtn();
		rb.setSize(200,200);
		rb.setVisible(true);
		rb.setBackground(Color.cyan);
	}
}
