package com.src.java.ex.day17;
//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
public class TabbedPaneEx extends JFrame {
	JFrame f;
	 TabbedPaneEx()
	 {

		     f = new JFrame();
		    JTabbedPane tp = new JTabbedPane();
		    ButtonClass bc=new ButtonClass();
		    CheckboxCLass cc=new CheckboxCLass();
		   
		 
		    tp.addTab("button",bc);  
		    tp.addTab("checkbox",cc);
		    
		    f.add(tp);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
	 }
	 public static void main(String args[])
	 {
		  new TabbedPaneEx();
	 }
}
