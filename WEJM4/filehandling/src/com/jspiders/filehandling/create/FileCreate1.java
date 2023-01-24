package com.jspiders.filehandling.create;

import java.io.File;

public class FileCreate1 {
	 public static void main(String[] args) {
			File file=new File("D:\\J2EE");
			
	 try {
		if (file.exists()) {
			System.out.println("file already exists");
		}else {
			file.createNewFile();
			System.out.println("New file created");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}
