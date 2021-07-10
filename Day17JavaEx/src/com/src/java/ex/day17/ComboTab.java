package com.src.java.ex.day17;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboTab extends JFrame implements ItemListener {
	JComboBox cb1,cb2;
	JLabel l1,l2,l3,l4;
	JFrame f;
	ComboTab()
	{
		 String city[]={"Chennai","Trichy","Madurai","Tutricon","Salem"}; 
		 
		 String fruits[]={"apple","mango","kiwi","watermelon","orange"};    
		 
		 cb1=new  JComboBox(city);
		 cb1.addItemListener(this);
		 
		 cb2=new  JComboBox(fruits);
		 cb2.addItemListener(this);
		 
		  l1 = new JLabel("select  city ");
		  l3=new JLabel("Select  fruits");
		  l2=new JLabel();
		  l4=new JLabel();
		  
		  l1.setForeground(Color.red);
	      l3.setForeground(Color.blue);
	      
		  f=new JFrame();
		  JPanel p = new JPanel();
		  
	       
		  p.setLayout(new FlowLayout());
		  
		  p.add(l1);
		  p.add(cb1);
		  p.add(l2);
		  p.add(l3);
		  p.add(cb2);
		  p.add(l4);
		  f.add(p);
		  
		 f.setSize(200, 200);
		  
	        f.show();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cb1)
		{
			l2.setText(cb1.getSelectedItem()+" selected");
		}
		if(e.getSource()==cb2)
		{
			l4.setText(cb2.getSelectedItem()+" selected");
		}
		
	}
	public static void main(String args[])
	{
		new ComboTab();
	}
}
