package com.src.java.ex.day16;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
//import java.lang.Exception;
public class LoginPage extends JFrame implements ActionListener  {
	JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
    LoginPage()  
    {     
        userLabel = new JLabel();  
        userLabel.setText("Username");     
         
        textField1 = new JTextField(15);   
   
        passLabel = new JLabel();  
        passLabel.setText("Password");   
          
        textField2 = new JPasswordField(15); 
                
        b1 = new JButton("SUBMIT"); 
          
       
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);    
        newPanel.add(textField1);   
        newPanel.add(passLabel);     
        newPanel.add(textField2);   
        newPanel.add(b1);          
          
        
        add(newPanel, BorderLayout.CENTER);  
          
        b1.addActionListener(this);     
        setTitle("LOGIN FORM"); 
    }
        
        public void actionPerformed(ActionEvent ae)     
        {  
            String userValue = textField1.getText();         
            String passValue = textField2.getText();  
            
            if (userValue.equals("gayu") && passValue.equals("gayu48"))
            {    
                NewPage page = new NewPage();  
                  
                page.setVisible(true);  
                  
               
                JLabel wellabel = new JLabel("Welcome: "+userValue);  
                page.getContentPane().add(wellabel);  
            }  
            else{   
                //System.out.println("Please enter valid username and password");
                JFrame f=new JFrame();  
                JOptionPane.showMessageDialog(f,"Invalid user or password .","Alert",JOptionPane.WARNING_MESSAGE);    
            }  
        }  
    
    }  
