package com.src.java.ex.day14;
import java.awt.*;
import java.awt.event.*;


public class LoginDemo extends Frame implements ActionListener{
	 Label l1,l2,l3;
     TextField tf1,tf2;
     Button btn,btn1;
     
      LoginDemo(String s)
      {
        btn=new Button("Login");
        btn1=new Button("Cancel");

        l1=new Label("username:",Label.CENTER);
        l2=new Label("password:",Label.CENTER);
        l3=new Label();
        tf1=new TextField(20);
        tf2=new TextField(20);

        btn.addActionListener(this);
        btn1.addActionListener(this);

       setLayout(new GridLayout(4,2));
       add(l1);
       add(tf1);
       add(l2);
       add(tf2);
       add(btn);
       add(btn1);
       add(l3);
   
      }
       public void actionPerformed(ActionEvent ae)
     {
         String s=ae.getActionCommand();
         if(s.equals("Login"))
         {
          String str1 =tf1.getText();
          String str2=tf2.getText();
         if(str1.equals("gayu") && str2.equals("gayu48"))
         {
           l3.setText("Logined successfully!!");
         }
         else{
           l3.setText("Invalid user name or password");
         }
         }
         else 
         {
          tf1.setText(" ");
          tf2.setText(" ");
          l3.setText("Canceled");
         }
      }
        public static void main(String args[])
        {  
            LoginDemo ld=new LoginDemo("Login Form");
            ld.setSize(400,400);
            ld.setVisible(true);
            ld.setTitle("my login window");
            ld.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we) 
                {
                    System.exit(0);
                }
            });
        }

}
