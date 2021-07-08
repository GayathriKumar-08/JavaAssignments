package com.src.java.ex.day14;

import java.awt.*;
import java.awt.event.*;


public class Circle extends Frame implements ActionListener{

	  Label l1, l2;
	  TextField tf, tf1;
	  Button btn, btn1;

	  Circle(String s) {

	    btn = new Button("AreaOfCircle");
	    btn1 = new Button("Clear");

	    btn.addActionListener(this);
	    btn1.addActionListener(this);

	    tf = new TextField(20);
	    tf1 = new TextField(20);
	    l1 = new Label("Enter radius:");
	    l2 = new Label("Result:");

	    setLayout(new FlowLayout());
	    
	    add(l1);
	    add(tf);
	    add(l1);
	    add(tf);
	    
	    add(btn);
	    add(btn1);
	    add(tf1);
	  }

	  public void actionPerformed(ActionEvent se) {
	    String s = se.getActionCommand();

	    if (s.equals("AreaOfCircle")) {
	      int n1 = Integer.parseInt(tf.getText());
	      float n2 = 3.14f;
	      tf1.setText(Float.toString(n2 * n1 * n1));
	    } else {
	      tf.setText(" ");
	      tf1.setText(" ");
	    }
	  }

	  public static void main(String args[]) {
	    Circle c = new Circle(" Circle Class...");
	    c.setSize(300, 300);
	    c.setVisible(true);
	    c.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });

	  }
}
