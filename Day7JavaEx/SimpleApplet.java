import java.applet.*;
import java.awt.*;
//<applet code="SimpleApplet" width="200" height="200">
//</applet>

public class SimpleApplet extends Applet
{
     public void paint(Graphics g)
     {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        System.out.println(formatter.format(date));  
        g.drawString("SampleApplet",100,100);
     }
}
