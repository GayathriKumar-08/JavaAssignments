package com.src.java.ex.day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectClass {
	public static void main(String args[]) throws Exception {
		
		   Test obj = new Test();
		   Class cl = obj.getClass();
	        System.out.println("The name of class is " +cl.getName());
	        
	        Constructor constructor = cl.getConstructor();
	        System.out.println("The name of constructor is " +constructor.getName());
	  
	        System.out.println("public methods of class are : ");
	        Method[] methods = cl.getMethods();
	        for (Method method:methods)
	            System.out.println(method.getName());
	        
	        Method methodcall1 = cl.getDeclaredMethod("displayName",
                    String.class);
	        methodcall1.invoke(obj, "gayu");
	        
	        Field field = cl.getDeclaredField("studname");
	    
	        field.setAccessible(true);
	        
	        field.set(obj, "gayu");
	  
	       
	        Method methodcall2 = cl.getDeclaredMethod("displayNo",int.class);
	        methodcall2.invoke(obj, 1234);
	  
	        Method methodcall3 = cl.getDeclaredMethod("display");
	
	        methodcall3.setAccessible(true);
	  
	        methodcall3.invoke(obj);
	}

}
