package Time;
import java.util.Scanner;
public class Time123 {
	int hrs;
	int sec;
	int mins;
	int t;
    Scanner sc=new Scanner(System.in);
    
     public void secTohrs()
     {
    	 System.out.println("Enter the second for converting:");
    	 t =sc.nextInt();
    	 hrs=t/3600;
    	 mins =(t % 3600)/60;
    	 sec =(t % 3600)%60;
    	 System.out.println("Hours: " + hrs);
    	 System.out.println("Minutes: " + mins);
    	 System.out.println("Seconds: " + sec);
     }
     public void hrsTosec()
     { 
     System.out.println("Enter the hours for converting");
     hrs=sc.nextInt();
     sec=(hrs*3600);
     System.out.println("Seconds: " + sec);
     }
      public void minsTohrs()
     {
     System.out.print("Enter the minutes for converting: ");
     mins=sc.nextInt();
     hrs=mins/60;
     mins=mins%60;
     System.out.println("Hours: " + hrs);
     System.out.println("Minutes: " + mins);
     }
     public void hrsTomins()
     { 
     System.out.println("enter the hours converting");
     hrs=sc.nextInt();
     mins=(hrs*60);
     System.out.println("Minutes: " + mins);
     }
     
   
}
