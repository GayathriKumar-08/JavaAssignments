package com.src.java.ex.day17;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TreeDemo extends JFrame{

	    JTree tree;
	    DefaultMutableTreeNode folders,computerscience,mathematics,java,react,statistics,vectoralgebra,stat1,stat2,vect1,vect2;

	    TreeDemo() {
	        super("JTree Demo");

	        folders = new DefaultMutableTreeNode("folders");
	        computerscience = new DefaultMutableTreeNode("computerscience");
	        java = new DefaultMutableTreeNode("java.txt");
	        react = new DefaultMutableTreeNode("react.js");
	        mathematics = new DefaultMutableTreeNode("mathematics");
	        statistics = new DefaultMutableTreeNode("statistics.txt");
	        vectoralgebra = new DefaultMutableTreeNode("vectoralgebra.txt");
	       
	        stat1=new DefaultMutableTreeNode("statistics123.txt");
	        stat2=new DefaultMutableTreeNode("statistics1234.txt");
	        
	        vect1=new DefaultMutableTreeNode("vector123.txt");
	        vect2=new DefaultMutableTreeNode("vector1234.txt");
	        
	        statistics.add(stat1);
	        statistics.add(stat2);
	        
	        vectoralgebra.add(vect1);
	        vectoralgebra.add(vect2);
	        
	        computerscience.add(java);
	        computerscience.add(react);
	        
	        mathematics.add(statistics);
	        mathematics.add(vectoralgebra);
	        
	    
	        folders.add(computerscience);
	        folders.add(mathematics);

	        
	        tree = new JTree(folders);

	        getContentPane().add(new JScrollPane(tree));
	        setSize(200, 200);
	        setVisible(true);
	    }
}
