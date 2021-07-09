package com.src.java.ex.day15;

import java.awt.*;
import java.awt.event.*;
public class BtnCount extends Frame implements ActionListener{

	Button b1;
	Label l1;
	int count=0;
	BtnCount()
	{
		b1=new Button("Click-Me");
		 b1.addActionListener(this);
		 
		 l1=new Label();
		 
		 setLayout(new FlowLayout());
		
		 add(b1);
		 add(l1);
		 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
 
		count++;
		l1.setText(String.valueOf("Button Count:"+count));
	}
	public static void main(String args[])
	{
		BtnCount bc=new BtnCount();
		bc.setSize(200,200);
		bc.setVisible(true);
		bc.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
	}
	
}
