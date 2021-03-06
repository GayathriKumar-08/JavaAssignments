package com.src.java.ex.day15;

import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends Frame implements ItemListener{
  
    Checkbox r1,y1,g1;
    Label l1;
    TrafficLight()
    {
        CheckboxGroup cbg=new CheckboxGroup();
        r1=new Checkbox("Red",true,cbg);
        y1=new Checkbox("Yellow",false,cbg);
        g1=new Checkbox("Green",false,cbg);

        l1 = new Label("");

        r1.addItemListener(this);
        y1.addItemListener(this);
        g1.addItemListener(this);

        setLayout(new FlowLayout());
        add(r1);
        add(y1);
        add(g1);
        add(l1);

        setFont(new Font("Serif",Font.BOLD,30));
    }
    @Override
    public void itemStateChanged(ItemEvent e) {

        r1.setForeground(Color.BLACK);
		y1.setForeground(Color.BLACK);
		g1.setForeground(Color.BLACK);


        if(r1.getState() == true) {
			r1.setForeground(Color.red);
			l1.setForeground(Color.red);
			l1.setText("STOP");
		}
        if(g1.getState() == true) {
			g1.setForeground(Color.green);
			l1.setForeground(Color.green);
			l1.setText("GO");
		}
        if(y1.getState() == true) {
			y1.setForeground(Color.yellow);
			l1.setForeground(Color.yellow);
			l1.setText("READY");
		}
    }
    public static void main(String args[])
    {
        TrafficLight tl=new TrafficLight();
        tl.setSize(400,400);
        tl.setVisible(true);
        tl.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
    }

}