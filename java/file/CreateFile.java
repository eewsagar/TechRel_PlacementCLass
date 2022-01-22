package com.main.file;
import java.io.File;
import java.io.IOException;

public class CreateFile {  
	  public static void main(String[] args) {  
		    try {  
		      File myObj = new File("filename1.txt");  
		      if (myObj.createNewFile()) {  
		        System.out.println("File created: " + myObj.getName());  
		        System.out.println("File created: " + myObj.getAbsolutePath());
		      } else {  
		        System.out.println("File already exists.");  
		      }  
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();  
		    }  
		  }  
		} 