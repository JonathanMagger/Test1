package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class App4alter {
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
			
			PreparedStatement ps = conn.prepareStatement("SELECT id, firstname,lastname,age from Employee ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//Retrieve by column name
				int eid = rs.getInt("id");
				int eage = rs.getInt("age");
				String efirst = rs .getString("firstname");
				String elast = rs.getString("lastname");
				
				//Display values
				System.out.println();
				System.out.println("ID: "+eid);
				System.out.println(", Age: " + eage);
				System.out.println(", First-Name: " + efirst);
				System.out.println(", Last-Name: " + elast);
				System.out.println();
			}
			rs.close();
			
			Thread.sleep(2000);
			System.out.println("Records are displayed. . . ");
			
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed");
			
			}catch (SQLException se) {
				se.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			
			}

	}

}
