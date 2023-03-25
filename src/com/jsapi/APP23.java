package com.jsapi;
/*JDBC Rowset
 * The instance of Rowset is the java bean component because it has properties and java bean notification mechanism.
 * IT is introduced since JDK 5.
 * It is the warpper of ResultSet. It holds tabular data like ResultSet but it is easy and flexible to use.
 * 
 * JdbcRowSet
 * CachedRowSet
 * WebRowSet
 * JoinRowSet
 * FilteredRowSet
 * 
 * Advantage of Rowset
 * ===================
 * The Advantages of using RowSet are given below:
 * 
 *  it is easy and flexible to use
 *  It is Scrollabel and Updatable by default
 *  
 *  */

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class APP23 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/myjavacode";
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
			
			// Creating and Executing RowSet
			  JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			  rowSet.setUrl(DB_URL);
			  rowSet.setUsername("root");
			  rowSet.setPassword("root");
			  
			  rowSet.setCommand("select * from employee");
			  rowSet.execute();
			  
			  while (rowSet.next()) {
				  // Generating cursor Moved event
				  System.out.println("Id: "+rowSet.getInt(1));
				  System.out.println("Firstname: "+rowSet.getString(2));
				  System.out.println("Lastname: "+rowSet.getString(3));
				  System.out.println("Age: "+rowSet.getInt(4));
				  System.out.println();
				  }
			  System.out.println();
			  Thread.sleep(2000);
				System.out.println("Connection Closed");
			}catch (SQLException se) {
				se.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
		}//end try

	}

}
