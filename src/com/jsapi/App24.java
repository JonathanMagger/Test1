package com.jsapi;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class App24 {
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
			  
			  // Adding Listener and Moving RowSet
			  rowSet.addRowSetListener(new MyListener());
			  
			  while (rowSet.next()) {
				  //Generating cursor Moved event
				  System.out.println("Id: "+rowSet.getInt(1));
				  System.out.println("Firstname: "+rowSet.getString(2));
				  System.out.println("Lastname: "+rowSet.getString(3));
				  System.out.println("Age: "+rowSet.getInt(4));
				  System.out.println();
				  }
		}catch (Exception e ) {
			System.out.println("Exception is : "+e);
		}
			  

	}

}
class MyListener implements RowSetListener{
	public void cursorMoved (RowSetEvent event) {
		System.out.println("Cursor Moved. . . ");
	}
	public void rowChanged (RowSetEvent event) {
		System.out.println("Cursor Changed. . . ");
	}
	public void rowSetChanged (RowSetEvent event) {
		System.out.println("RowSet Changed. . . ");
	}
}