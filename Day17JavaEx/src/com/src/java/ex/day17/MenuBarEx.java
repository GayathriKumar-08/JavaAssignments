package com.src.java.ex.day17;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuBarEx extends Frame implements ActionListener{

	JFrame f;
	JMenuBar mb;    
	JMenu file,edit,format,view,help,zoomin,zoomout;    
	JMenuItem cut,copy,paste,selectAll,viewhelp,sendfeedback,save,saveAs,zoomoutminus,zoominplus;
	JTextArea txtarea;    
	MenuBarEx()
	{
		f=new JFrame(); 
		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");    
		selectAll=new JMenuItem("selectAll");  
		
		viewhelp=new JMenuItem("viewhelp");
	    sendfeedback=new JMenuItem("sendfeedback");
	     save=new JMenuItem("save");
	     saveAs=new JMenuItem("saveAs");
	     
	     zoomin=new JMenu("zoomin");
			zoomout=new JMenu("zoomout");
	      zoominplus=new JMenuItem("zoom-in-plus");
	      zoomoutminus=new JMenuItem("zoom-out-minus");
	      
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     cut.addActionListener(this);    
	     copy.addActionListener(this);    
	     paste.addActionListener(this);    
	     selectAll.addActionListener(this); 
	    
	     
	     mb=new JMenuBar();    
	     file=new JMenu("File");    
	     edit=new JMenu("Edit");
	     format=new JMenu("Format");    
	     view=new JMenu("View");    
	     help=new JMenu("Help");     
	    
	     mb.add(file);
	     mb.add(edit);
	     mb.add(format);
	     mb.add(view);
	     mb.add(help);
	     
	     file.add(save);
	     file.add(saveAs);
	     
	     edit.add(cut);
	     edit.add(copy);
	     edit.add(paste);
	     edit.add(selectAll);
	     
	    
	     zoomout.add(zoomoutminus);
	     zoomin.add(zoominplus);
	     help.add(zoomin);
	     help.add(zoomout);
	     
	     
	     txtarea=new JTextArea();
	     txtarea.setBounds(5,5,360,320);    
	     f.add(mb);
	     f.add(txtarea);    
	     f.setJMenuBar(mb);  
	     f.setLayout(null);    
	     f.setSize(400,400);    
	     f.setVisible(true); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)    
			txtarea.cut();    
			if(e.getSource()==paste)    
				txtarea.paste();    
			if(e.getSource()==copy)    
				txtarea.copy();    
			if(e.getSource()==selectAll)    
				txtarea.selectAll();    
			
	}
	public static void main(String args[])
	{
		MenuBarEx mbe=new MenuBarEx();
		
	}
	

}
