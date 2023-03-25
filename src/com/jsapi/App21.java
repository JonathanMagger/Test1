package com.jsapi;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// creating table to store file
public class App21 {
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
			
			PreparedStatement ps = conn.prepareStatement("insert into mytable values (?,?) ");
			
			ps.setInt(1, 101);
			
			File f = new File("C:\\Users\\Jonathan\\doc kerja\\ATS\\Tugas\\SQLJPG\\Try.txt");
			FileReader fr = new FileReader(f);
			ps.setCharacterStream(2, fr,(int)f.length());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("File is Stored in database Table. . . ");
			
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
