package com.jsapi;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


//image storing process
public class App17 {
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
			
			PreparedStatement ps = conn.prepareStatement("insert into myimage values (?,?) ");
			ps.setString(1, "micky");
			
			FileInputStream fin = new FileInputStream("C:\\Users\\Jonathan\\doc kerja\\ATS\\Tugas\\SQLJPG\\Try.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");
			conn.close();
			System.out.println("Connection Closed");
		}catch (Exception e) {e.printStackTrace();}

	}

}
