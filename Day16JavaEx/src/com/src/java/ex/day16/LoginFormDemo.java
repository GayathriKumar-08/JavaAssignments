package com.src.java.ex.day16;

import java.awt.Color;

import javax.swing.JOptionPane;

public class LoginFormDemo {
	public static void main(String arg[])  
    {  
        try  
        {  
           
        	LoginPage form = new LoginPage();  
            form.setSize(300,150);    
            form.setVisible(true);    
           
        }  
        catch(Exception e)  
        {     
            JOptionPane.showMessageDialog(null, e.getMessage());  
        } 
    }
}
