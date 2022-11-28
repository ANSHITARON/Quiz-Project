package com.velocity.mcq.projectcode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class fetchStudentRecord {
	
	
	public void fetch_student() throws SQLException
	{
	DAO dao=new DAO();
	Scanner sc=new Scanner(System.in);
	Connection conn=dao.getConnection();
	
	System.out.println("Enter student id to check the record");
	int sid=sc.nextInt();
	String query="select * from question_set.student where sid=?;";
	PreparedStatement preparestatement=conn.prepareStatement(query);
	preparestatement.setInt(1, sid);
	
	ResultSet rs=preparestatement.executeQuery();
	
	while(rs.next())
	{
		int id=rs.getInt(1);
		String sname=rs.getString(2);
		int marks=rs.getInt(3);
		
		System.out.print("sid: "+id+" name: "+sname+" marks: "+marks);
		System.out.println();
	}
	}
	
	

}
