package com.src.java.ex.day3;

public class RectSquare {
   public static void main(String args[])
   {
	   Rectangle rct=new Rectangle(4,4);
	   Square s=new Square(4);
	   System.out.println("area of rectangle: "+rct.areaRectangle());
	   System.out.println("perimeter of rectangle: "+rct.perimeterRectangle());
	   System.out.println("area of square: "+s.areaRectangle());
	   System.out.println("perimeter of square: "+s.perimeterRectangle());
   }
}
