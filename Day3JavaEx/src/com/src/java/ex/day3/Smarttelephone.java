package com.src.java.ex.day3;

public class Smarttelephone extends Telephone{

	@Override
	void lift() {
		System.out.println("The phone is ringing, please take the phone");
		
	}

	@Override
	void disconnected() {
	System.out.println("The call got disconnected, so please try again later");
	}
	  void smartTelephone()
	  {
		  System.out.println("This is smart telephone");
	  }
	  public static void main(String args[])
	  {
		  Smarttelephone stp=new Smarttelephone();
		  stp.disconnected();
		  stp.lift();
		  stp.smartTelephone();
	  }

}
