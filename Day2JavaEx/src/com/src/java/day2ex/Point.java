package com.src.java.day2ex;

public class Point {

	private int x;
	private int y;
	public Point()
	{
	}
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public void setXY(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getXY()
	{
		return x+y;
	}
	public void display()
	{
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
	}
	public double distance(Point p2)
	{
		return(Math.sqrt( (x-p2.x)* (x-p2.x) + (y-p2.y) * (y-p2.y)) );
	}
	
	public static void main(String args[])
	{
		double a, b, c;
		Point p,p1,p2;

		p = new Point(4, 8);
	
		p1 = new Point();
		p2=new Point();
		p1.setX(2);
		p1.setY(4);
		p2.setXY(4, 3);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		p1.setXY(8,4);
        
		a=p1.distance(p2);
		b=p2.distance(p);
		c=p.distance(p1);
		System.out.println("Distance between point p1 to p2 is "+a);
		System.out.println("Distance between point p2 to p is "+a);
		System.out.println("Distance between point p to p1 is "+a);
		p.display();
		p1.display();
	}
}