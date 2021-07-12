import java.net.*;  
import java.io.*;  
class ClientClass{  
 
    private Socket socket            = null;
    private DataInputStream  input   = null;
    private DataOutputStream out     = null;
  
    public ClientClass(String address, int port)
    {
        
        try
        {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            input  = new DataInputStream(System.in);
 
            out    = new DataOutputStream(socket.getOutputStream());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
      
        String line = "";
 
        while (!line.equals("stop"))
        {
            try
            {
                line = input.readLine();
                out.writeUTF(line);
            }
            catch(IOException i)
            {
                System.out.println(i);
            }
        }
  
        try
        {
            input.close();
            out.close();
            socket.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
  
    public static void main(String args[])
    {
        ClientClass client = new ClientClass("127.0.0.1", 5000);
    }
}