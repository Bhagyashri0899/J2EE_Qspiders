package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {
     public static void main(String[] args) {
    	 File file=new File("char_file.txt");
 		
 		if (file.exists()) {
 			System.out.println(file.getName() + " already exists");
 		}else {
 			try {
 				file.createNewFile();
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
 			System.out.println(file.getName()+ " is created");
 		}
 		try {
 			FileWriter fileWrite=new FileWriter(file);
 			fileWrite.write("data from the file handling program");
 			System.out.println("Data written to file successfully");
 			fileWrite.close();
 		
 		}
 		catch(IOException e) {
 			e.printStackTrace();
 		}
 	}
	
}
