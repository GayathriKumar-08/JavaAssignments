package com.src.java.day7.ex;

import java.io.File;

public class FileFind {

	public void fileFind(String fname) {
		System.out.println("finding the file....");
		File f=new File(fname);
		if(f.exists())
		{
			System.out.println("File exists");
			System.out.println("Name of the file: "+f.getName());
			System.out.println("readable or not: "+f.canRead());
			System.out.println("Writable or not: "+f.canWrite());
			System.out.println("size of the file in bytes: "+f.length());	
			//System.out.println("size of the file in bytes: "+f.getAbsolutePath());	
			}
		else
		{
			System.out.println("Given file is not found..... ");
		}
	}

	public void getFileExtension(String fname) {
		String extension = "";
		File ff=new File(fname);
		if(ff.exists()) {
		int i = fname.lastIndexOf('.');
		if (i >= 0) {
			extension = fname.substring(i+1);
		}
		System.out.println("Type of file is: "+extension);
		}else
		{
			System.out.println("File not Found");
		}
     }
}



