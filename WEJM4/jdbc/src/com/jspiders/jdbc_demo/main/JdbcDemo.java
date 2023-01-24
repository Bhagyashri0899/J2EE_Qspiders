package com.jspiders.jdbc_demo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class JdbcDemo {

	public static void main(String[] args)throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?user=root&password=Bhagya@99");

		Statement st = con.createStatement();

		//String query = "create table student1(ID int primary key,SName varchar(20),SMarks int)";
		
		String query1 = "Insert into student1 value(2, 'Anu',50)";
		
	    //String query2 = "Delete from student1 Where ID=2";
		
	    //String query3 = "Update student1 Set SName='aaruhi' Where ID=1";
		
		//st.executeUpdate(query);
		st.executeUpdate(query1);
	    //st.executeUpdate(query2);
	    //st.executeUpdate(query3);
		System.out.println("Student Table Create Successfully");

		st.close();
		con.close();
	}

	

}
