package com.src.java.ex.day17;
import java.awt.*;
import javax.swing.*;
public class CheckboxCLass extends JFrame {
	JCheckBox c1,c2,c3;
	JFrame f;
	CheckboxCLass()
	{
		c1=new JCheckBox("Java");
		c2=new JCheckBox("React");
		c3=new JCheckBox("Angular");
		
		f=new JFrame();
		f.setLayout(new FlowLayout());
		f.add(c1);
		f.add(c2);
		f.add(c3);
		c1.setForeground(Color.magenta);
		c2.setForeground(Color.blue);
		c3.setForeground(Color.orange);
		f.setSize(200,200);
		f.setVisible(true);
	}
//	public static void main(String args[])
//	{
//		new CheckboxCLass();
//	}
}
