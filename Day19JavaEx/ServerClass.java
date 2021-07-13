
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerClass extends Example {
	
		   public ServerClass() {} 
		   public static void main(String args[]) { 
		      try { 
		       
		    	  Example obj = new Example(); 
		   
		         Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);  
		       
		         Registry registry = LocateRegistry.getRegistry(); 
		         
		         registry.bind("Hello", stub);  
		         System.err.println("Server ready"); 
		      } catch (Exception e) { 
		         System.err.println("Server exception: " + e.toString()); 
		         e.printStackTrace(); 
		      } 
		   } 
} 
