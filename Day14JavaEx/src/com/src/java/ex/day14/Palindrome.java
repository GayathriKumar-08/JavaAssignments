package com.src.java.ex.day14;

import java.awt.*;
import java.awt.event.*;

public class Palindrome  extends Frame implements ActionListener{

    Label l,l1,l2;
    TextField tf;
    Button btn,btn1;

    Palindrome ()
    {
        btn=new Button("check");
        btn1=new Button("Clear");
        tf=new TextField(20);
        l=new Label();
        l1=new Label("Enter String:");
        l2=new Label("Result:");
        
        setLayout(new GridLayout(3,4));
        add(l1);
        add(tf);
        
        add(l2);
        add(l);
        add(btn);
        add(btn1);
       
        btn.addActionListener(this);
        btn1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
   
      String reverseUserInput="";
                String userInput = tf.getText();
                int length = userInput.length();

                for (int i = length-1; i>=0; i-- )
                {
                    reverseUserInput = reverseUserInput + userInput.charAt(i);
                }
                if (userInput.equals(reverseUserInput))  
                	 l.setText("Entered string is a palindrome"+reverseUserInput);  
                 else  
                	 l.setText("Entered string isn't a palindrome"+reverseUserInput);   

         
    }
    public static void main(String args[])
    {
        Palindrome ac=new Palindrome ();
        ac.setSize(300,300);
        ac.setVisible(true);
        ac.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
    }

}
