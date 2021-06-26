package com.src.java.ex.day3;

public class FountainPen extends Pen{
	@Override
   void write()
   {
	 System.out.println("write with fountainpen");
   }
	@Override
   void refill()
   {
	   System.out.println("Refill the fountain pen");
   }
   void changeNib()
   {
	   System.out.println("change nib for smooth writting");
   }
   
   public static void main(String args[])
   {
	   FountainPen fpen=new FountainPen();
	   fpen.changeNib();
	   fpen.write();
	   fpen.refill();
   }
}
