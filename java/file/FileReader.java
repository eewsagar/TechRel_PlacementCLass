package com.main.file;

import java.io.File;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		try {
			File fr = new File("filename.txt");
			Scanner sc=  new Scanner(fr);
			while(sc.hasNextLine()) {
				String data  =  sc.nextLine();
				System.out.println(data);
			}
			Fiedetails(fr);
			sc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void Fiedetails(File myObj) {
		System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	}

}
