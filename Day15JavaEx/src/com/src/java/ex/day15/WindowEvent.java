package com.src.java.ex.day15;

import java.awt.Color;
import java.awt.Label;

public class WindowEvent {
	
		public static void main(String[] args) 
		{
			AnonymousEx frame = new AnonymousEx(); 
	       frame.setTitle("Windows Events with Anonymous Inner class"); 
	       frame.setSize(300, 300);
	       frame.setBackground(Color.red);
	       
	       Label lb;
	       
	       lb = new Label("window is getting closed",Label.CENTER);
	       
	       lb.setBounds(5, 50, 150, 30);
	       
	       lb.setBackground(Color.yellow);
	       lb.setForeground(Color.BLUE);
	       
	       frame.add(lb);
	       frame.setVisible(true); 
		}

	}
