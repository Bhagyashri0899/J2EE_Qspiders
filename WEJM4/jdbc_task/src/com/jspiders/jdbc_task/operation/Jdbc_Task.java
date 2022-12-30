package com.jspiders.jdbc_task.operation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc_Task {
	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath;
	
	public static void main(String[] args) {
		try {
    	    
	    	   filePath="D:\\J2EE\\jdbc_task\\resources\\db_info.properties";
	    	   fileReader=new FileReader(filePath);
	    	   properties = new Properties();
	    	   properties.load(fileReader);
	    	   Class.forName(properties.getProperty("driverPath"));
	    	   connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
	    	   statement = connection.createStatement();
	    	   
	                   //------<  Insert 5 Records >------//
	    	   //result = statement.executeUpdate(properties.getProperty("query"));
	    	  
	    	   //------<  Desplay All Records >------//
	    	   resultSet=statement.executeQuery(properties.getProperty("query1"));
	    	   while(resultSet.next()){
	    		   System.out.println(resultSet.getString(1) + " | "
	    				              + resultSet.getString(2) + " | "
	    				              + resultSet.getString(3) + " | "
	    				              + resultSet.getString(4) + " | "
	    				              + resultSet.getString(5));
	    	   }
	    	   
	    	   //------<  Update 2 Records >------//
	    	   //result = statement.executeUpdate(properties.getProperty("query2"));
	    	  // result = statement.executeUpdate(properties.getProperty("query3"));
	    	   
	    	  
	    	   //------<  Delete 1 Record >------//
	    	  // result = statement.executeUpdate(properties.getProperty("query4"));
	    	 
	    	   
	    	   System.out.println(result + "row(s) affected");
	       }
	       catch(SQLException e) {
	    	   e.printStackTrace();
	       }
	       catch(ClassNotFoundException e) {
	    	   e.printStackTrace();
	       }
	       catch(FileNotFoundException e) {
	    	   e.printStackTrace();
	       }
	       catch(IOException e) {
	    	   e.printStackTrace();
	       }
	       
	       finally {
	    	   try {
	    		   if(connection != null) {
	    			   connection.close();
	    		   }
	    		   if(statement != null) {
	    			   statement.close();
	    		   }
	    		   if(resultSet != null) {
	    			   resultSet.close();
	    		   }
	    		  
	    	   }catch(SQLException e2) {
	        	   e2.printStackTrace();
	           }
	       }
	}
}
