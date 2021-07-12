import java.net.*;  
import java.io.*;  
class ServerClass{  
 private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       =  null;
  
    public ServerClass(int port)
    {
      
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");
  
            System.out.println("Waiting for a client ...");
  
            socket = server.accept();
            System.out.println("Client accepted");
  
            in = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
  
            String line = "";
  
           
            while (!line.equals("stop"))
            {
                try
                {
                    line = in.readUTF();
                    System.out.println(line);
  
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Connection Closed");
  
          
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
  
    public static void main(String args[])
    {
        ServerClass server = new ServerClass(5000);
    }
}