package com.onlinequiz;

import java.sql.*;

public class DBOps {
	private String url = new String();
	private String user = new String();
	private String pwd = new String();
	
	{
		url = "jdbc:oracle:thin:@10.14.5.88:1521/XE";
		user = "System";
		pwd = "sahithi";
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPwd() {
		return pwd;
	}
	
	public void addToDB(InputQuestion ques){
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //Loading the driver
			Connection conn = DriverManager.getConnection(url,user,pwd); //Establishing connection to database
			System.out.println("Connection = "+conn);
			
			String query = "INSERT INTO Questions_Database VALUES(?,?,?,?,?,?,?,?)";
			
			PreparedStatement stat1 = conn.prepareStatement(query);
			
			stat1.setString(1, ques.getQuestion()); 
			stat1.setString(2, ques.getOption1()); 
			stat1.setString(3, ques.getOption2()); 
			stat1.setString(4, ques.getOption3()); 
			stat1.setString(5, ques.getOption4()); 
			stat1.setString(6, ques.getAnswer());
			stat1.setString(6, ques.getSubject());
			stat1.setString(6, ques.getDifficulty_level());
			stat1.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
