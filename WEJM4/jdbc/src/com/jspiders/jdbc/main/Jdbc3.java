package com.jspiders.jdbc.main;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3 {

	public static void main(String[] args) {
		
		try {
			//Step1: Load the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Load the db_info file in fileReader object                
			FileReader fileReader=new FileReader(" D:\\J2EE\\jdbc\\resources\\db_info.properties");
			
			//Loading the file as properties of jdbc
			Properties properties=new Properties();
			properties.load(fileReader);
			
			//Step2: open connection
			Connection connection=DriverManager.getConnection("jdbc.mysql://localhost:3306/wejm4", properties);
			
			//Step3: create / prepare statement 
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select* from student1");
			
			//Step4: process the result
			connection.close();
			statement.close();
			resultSet.close();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
