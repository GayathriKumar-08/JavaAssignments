package com.src.java.ex.day14;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FrameEx extends Frame{
	Label l;
    FrameEx(String t)
    {
           l=new Label();
           l.setText("Hello this is frame example....");
           setLayout(new FlowLayout());
           add(l);
    }
    public static void main(String args[])
    {
        FrameEx fm=new FrameEx("Frame example");
        fm.setSize(200,200);
        fm.setVisible(true);
        fm.setTitle("frame example");
      
        fm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
    }
    
}