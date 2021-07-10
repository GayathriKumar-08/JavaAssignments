package com.src.java.ex.day17;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ScrollPaneEx extends JFrame {
		JScrollPane scrollpane;
		public ScrollPaneEx()
		{
			setSize(300, 200);

			
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			String languages[] = {"Java","vs", "Python","Operating System","Data Structure", "Algorithm","PHP language", "JAVASCRIPT",
					"C Sharp","react","Rlanguage","software Testing,","c","c++" };

			JList list = new JList(languages);

			scrollpane = new JScrollPane(list);

			getContentPane().add(scrollpane, BorderLayout.CENTER);
		}

		public static void main(String args[])
		{
			
			ScrollPaneEx sl = new ScrollPaneEx();
			sl.setVisible(true);
		}
	}

