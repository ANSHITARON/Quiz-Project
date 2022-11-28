package com.velocity.mcq.projectcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Connection;
public class DAO 
{    static Connection con;
	public Connection getConnection()
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/question_set","root","XYZ");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    	 return con;
	}



}

