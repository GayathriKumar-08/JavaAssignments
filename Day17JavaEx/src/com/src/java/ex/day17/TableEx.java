package com.src.java.ex.day17;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TableEx {

	JFrame f;
	TableEx()
	{
		 String empdata[][]={ 
				 {"A1001","Geetha","67000"},    
                 {"A1002","Samyuktha","78000"},    
                 {"A1003","Jailakshmi","70000"},
                 {"A1004","Leena","52000"},
                 {"A1005","Seetha","25000"},
                 {"A1006","Sabitha","30000"}
                 };    
			String col[]= {"Emp-ID","Emp-Name","Emp-Salaray"};
			
			JTable tab=new JTable(empdata,col);
			tab.setBounds(30,40,200,300);          
			JScrollPane sp=new JScrollPane(tab);    
			    
			   f=new JFrame();
			   f.add(sp);          
			    f.setSize(200,200);    
			    f.setVisible(true);
			    f.setForeground(Color.cyan);
	}
	public static void main(String args[])
	{
		new TableEx();
	}
}
