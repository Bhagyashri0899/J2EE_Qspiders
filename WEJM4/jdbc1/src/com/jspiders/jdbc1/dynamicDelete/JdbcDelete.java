package com.jspiders.jdbc1.dynamicDelete;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDelete {
	private static Connection connection;
	private static PreparedStatement preparedStatement ;
	private static int result;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = "D:\\J2EE\\jdbc1\\Resources\\db_info.properties";
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			preparedStatement = connection.prepareStatement(properties.getProperty("query2"));
			
			System.out.println("Enter the student id:  ");
			int id = scanner.nextInt();
			preparedStatement.setInt(1, id);
			
			System.out.println("Enter the student name:  ");
			String name = scanner.next();
			preparedStatement.setString(2, name);
			
			result= preparedStatement.executeUpdate();
			System.out.println(result + "row(s) affected");
			
			
			resultSet = preparedStatement.executeQuery(properties.getProperty("query"));
			 while(resultSet.next()){
	    		   System.out.println(resultSet.getInt(1) + " | "
	    				              + resultSet.getString(2) + " | "
	    				              + resultSet.getString(3) + " | "
	    				              + resultSet.getString(4) + " | "
	    				              + resultSet.getString(5));
	    	   }
		       
		 }catch(Exception e) {
			e.printStackTrace();
		}
	   	  finally {
			if(connection != null) {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
	    
		if(preparedStatement != null) {
			try {
				preparedStatement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
  }

}
