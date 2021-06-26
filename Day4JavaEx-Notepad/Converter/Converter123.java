package Converter;
import java.util.Scanner;
import Currency.Currency123 ;
import Distance.Distance123 ;
import Time.Time123 ;

public class Converter123 {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int choice,ch;
	Currency123 c=new Currency123();
	Distance123 d=new Distance123();
	Time123 t=new Time123();
	do
	{
         System.out.println("============================");
	System.out.println("1.dollar to Inr ");
	System.out.println("2.Inr to dollar ");
	System.out.println("3.Euro to Inr ");
	System.out.println("4..Inr to Euro ");
	System.out.println("5.Yen to Inr ");
	System.out.println("6.Inr to Yen ");
	System.out.println("7.Meter to kilometer ");
	System.out.println("8.kilometer to meter ");
	System.out.println("9.Miles  to kilometer ");
	System.out.println("10.kilometer to miles");
	System.out.println("11.Hours to Minutes");
	System.out.println("12.Hours to Seconds");
	System.out.println("13.Seconds to Hours");
	System.out.println("14.Minutes to Hours");
   System.out.println("============================");
	System.out.println("Enter ur choice");
   System.out.println("============================");
	choice=s.nextInt();
	switch(choice)
	{
	case 1:
	{
	c.dollTorup();
	break;
	}
	case 2:
	{
	c.inrTousd();
	break;
	}
	case 3:
	{
	c.euroToinr();
	break;
	}
	case 4:
	{
	c.inrToeuro();
	break;
	}
	case 5:
	{
		c.yenToinr();
	break;}
	case 6 :
	{
	c.inrToyen();
	break;
	}
	case 7  :
	{
	d.kmTom();
	break;
	}
	case 8  :
	{
	d.mTokm();
	break;
	}
	case 9  :
	{
	d.milesTokm();
	break;
	}
	case 10  :
	{
	d.kmTomiles();
	break;
	}
	case 11 :
	{
	t.secTohrs();
	break;
	}
	case 12 :
	{
	t.hrsTosec();
	break;
	}
	case 13 :
	{
	t.minsTohrs();
	break;
	}
	case 14 :
	{
	t.hrsTomins();
	break;
	}
	}
	System.out.println("Enter 0 to exit and 1 to continue ");
	ch=s.nextInt();
	}while(ch==1);
	}
}