package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {
      public static void main(String[] args) {
		try {
			//Step1-->Load Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step2--> Open connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root&password=Bhagya@99");
			
			//Step3--> Create / Prepare statement
			Statement statement=connection.createStatement();
					
					ResultSet resultSet= statement.executeQuery("select * from student");
			
			//Step4-->Process the result
					while (resultSet.next())
					{
						System.out.println(resultSet.getInt(1) + " | "
								           + resultSet.getString(2) + " | "
						                   + resultSet.getString(3));
					}
					
			//Close connection		
					connection.close();
					statement.close();
					resultSet.close();
					
		} catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
}