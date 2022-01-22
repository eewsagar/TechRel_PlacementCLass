package com.main.file;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
     FileWriter fw;
	try {
		 fw = new FileWriter("filename.txt");
		 String data = "In the following example, we use the FileWriter class together"
		 		+ " with its write() method to "
		 		+ "write some text to the file we created in the example above. "
		 		+ "Note that when you are done writing to"
		 		+ " the file, you should close it with the close() method:";
		 fw.write(data);
	     fw.close();
	     System.out.println("Successfully wrote to the file.");
	} catch (IOException e) {
		System.out.println("show me the error :"+e);
		e.printStackTrace();
	}
    

	}

}
