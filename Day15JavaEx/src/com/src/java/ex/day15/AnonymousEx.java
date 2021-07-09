package com.src.java.ex.day15;
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*; 

public class AnonymousEx extends JFrame{
	AnonymousEx() 
     { 
       addWindowListener(new WindowAdapter() 
                        { 
                          public void WindowClosing(WindowEvent e) 
                           { 
                             System.exit(0); 
                           } 
                        }) ; 
      } 
} 
 