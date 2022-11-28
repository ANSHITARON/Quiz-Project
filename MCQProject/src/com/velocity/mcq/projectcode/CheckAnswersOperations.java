package com.velocity.mcq.projectcode;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CheckAnswersOperations {

	public static void main(String[] args) throws SQLException {
	
		DAO dao=new DAO();
		Connection conn=dao.getConnection();
		Statement st=conn.createStatement();
		String name="aaa";
		int marks=6;
		st.execute("insert into question_set.student(sname,marks) values('"+name+"'"+","+marks+");");
		
		System.out.println("Record inserted Successfully");
		conn.close();
		st.close();
		
		
	

	}

}
