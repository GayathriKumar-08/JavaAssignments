package com.src.java.ex.day15;
import java.awt.*;  
import java.awt.event.*;  
public class AdapterClass {
	Frame f;  
	AdapterClass(){  
	        f=new Frame("Window Adapter");  
	        f.addWindowListener(new WindowAdapter(){  
	            public void windowClosing(WindowEvent e) {  
	                f.dispose();  
	                f.setTitle("Window Closing");
	            }  
	        });  
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	    }  
	public static void main(String[] args) {  
	    new AdapterClass();  
	    
	}  
}
