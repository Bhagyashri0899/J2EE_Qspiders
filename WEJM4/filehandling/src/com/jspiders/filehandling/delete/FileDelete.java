package com.jspiders.filehandling.delete;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File file=new File("Demo.txt");
		
		if (file.exists()) {
			file.delete();
			System.out.println("file is deleted");
		}else {
			System.out.println("file dose not exists");
		}

	}

}
