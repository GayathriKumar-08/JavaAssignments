package com.src.java.ex.day3;

public class TV implements Smarttvremote{
	public void tvMethod()
	{
		System.out.println("This is a tv class which contains the methods of the interface");
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Override
	public void remoteDesign() {
		System.out.println("The old version of tv remote will be in rectangle");
		System.out.println("The newer version of smart tv remote will be in various shapes linke oval,rectangle etc.");
		System.out.println("----------------------------------------------------------------------------------------------");
	}

	@Override
	public void remoteColor() {
     System.out.println("----------------------------------------------------------------------------------------------");
     System.out.println("most of the remote colors are either black or greay");
     System.out.println("----------------------------------------------------------------------------------------------");
	}

	@Override
	public void features() {
		System.out.println("New version of Tv remote");
		System.out.println("Smart remote can used to have wifi connectivity");
		
	}

}
