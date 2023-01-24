package com.jspiders.filehandling.create;

import java.io.File;

public class FileCreate {
          public static void main(String[] args) {
			File file=new File("demo.txt");
//			try {
//				file.createNewFile();
//				System.out.println("New file created");
			
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