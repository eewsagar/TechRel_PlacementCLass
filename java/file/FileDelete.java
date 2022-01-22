package com.main.file;

import java.io.File;
import java.io.IOException;

public class FileDelete {
  public static void main(String[] args) throws IOException {
	File f =  new File("filename2.txt");
	if(f.delete()) {
		System.out.println("file is deleted");
	}else {
		System.out.println("file not deleted");
	}
}
}
