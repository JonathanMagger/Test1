package com.jsapi;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class App18 {
			//JDBC driver name and database URL
			static final String DB_URL = "jdbc:mysql://localhost:3306/myjavacode";
			//Database credentials
			static final String USER = "root";
			static final String PASS = "root";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//STEP 3 : open a connection
			System.out.println("Connecting to Database... ");
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			
			Thread.sleep(2000);
			System.out.println("Database is Connected ");

			Thread.sleep(2000);
			//STEP 4 : Execute a query
			System.out.println("Retrieving image from given Database... ");
			stmt = conn.createStatement();
			
			PreparedStatement ps = conn.prepareStatement("select * from Assignment");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {//now on 1st row
				
				Blob b = rs.getBlob(8);//2 means 2nd column data
				byte barr[] = b.getBytes(1,(int) b.length());//1 means first image
				
				FileOutputStream fout = new FileOutputStream("C:\\Users\\Jonathan\\doc kerja\\ATS\\Tugas\\SQLJPG\\mycodetry1.jpg");
			
				fout.write(barr);
				fout.close();
			}//end of if
			System.out.println("Operation Completed. . . ");
			
			stmt.close();
			conn.close();
			}catch (Exception e) {e.printStackTrace();}
	}

}
