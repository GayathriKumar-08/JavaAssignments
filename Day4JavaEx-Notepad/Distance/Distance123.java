package Distance;
import java.util.Scanner;

public class Distance123 {
    double km;
    double m;
    double miles;
    
    Scanner sc=new Scanner(System.in);
     public void kmTom()
     {
    	 System.out.println("Enter the KM:");
    	 km=sc.nextDouble();
    	 m=km*1000;
    	 System.out.println("KM: "+km+" M:"+m);
     }
     public void mTokm()
     {
    	 System.out.println("Enter the M:");
    	 m=sc.nextDouble();
    	 km=m/1000;
    	 System.out.println("M: "+m+" KM:"+km);
     }
     public void milesTokm()
     {
    	 System.out.println("Enter the Miles:");
    	 miles=sc.nextDouble();
    	 km=miles*1.60934;
    	 System.out.println("Miles: "+miles+" KM:"+km);
     }
     public void kmTomiles()
     {
    	 System.out.println("Enter the kM:");
    	 km=sc.nextDouble();
    	 miles=km*0.621371;
    	 System.out.println("kM: "+km+" Miles:"+miles);
     }
}