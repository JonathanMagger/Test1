package com.jsapi;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Retrieving file from database
public class App22 {
	//JDBC driver name and database URL
	static final String DB_URL = "jdbc:mysql://localhost:3306/myjavacode";
	//Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) {
	Connection conn = null;
	
	try {
		//STEP 3 : open a connection
		System.out.println("Connecting to Database... ");
		conn = DriverManager.getConnection(DB_URL, USER,PASS);
		
		Thread.sleep(2000);
		System.out.println("Database is Connected ");

		Thread.sleep(2000);
		//STEP 4 : Execute a query
		PreparedStatement ps = conn.prepareStatement("select * from MyTable");
		ResultSet rs = ps.executeQuery();
		rs.next();// now on 1st row
		
		Clob c = rs.getClob(2);
		Reader r = c.getCharacterStream();
		
		FileWriter fw = new FileWriter("C:\\Users\\Jonathan\\doc kerja\\ATS\\Tugas\\SQLJPG\\Sola1.txt");
		
		int i;
		while ((i=r.read())!=-1)
			fw.write((char)i);
		
		fw.close();
		
		System.out.println("Successfully file is retrieved");
		
		conn.close();
		
		System.out.println();
		Thread.sleep(2000);
		System.out.println("Connection Closed");
	}catch (SQLException se) {
		se.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (conn!=null)
				conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}//end finally try
	}//end try
		
	}

}
