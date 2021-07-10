package com.src.java.ex.day17;

import javax.swing.UIManager;

public class TreeTest {
	public static void main(String args[]) throws Exception {
        UIManager
                .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new TreeDemo();
    }
}
