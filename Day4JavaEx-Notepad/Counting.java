public class Counting
{
  public static void main(String args[]){
  int num,count=0,invalid=0;
   for(int i=0;i<args.length;i++)
   {
      try
       {
           num=Integer.parseInt(args[i]);
       }
        catch(NumberFormatException e)
       {
         invalid=invalid+1;            
         continue;             
        }
        count=count+1;                         
     }
    System.out.println("Count:"+count);
    System.out.println("Invalider : "+invalid);
}
}

