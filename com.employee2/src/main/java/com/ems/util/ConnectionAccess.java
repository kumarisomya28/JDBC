package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionAccess {
	private final static String url="jdbc:mysql://localhost:3306/ems";
   private final static String username="root";
   private final static String password="9608";
   
   public static Connection getConnection() {
	    
	   try {
		   return DriverManager.getConnection(url,username,password);
	   } catch(SQLException e) {
		   e.printStackTrace();
	   }
	   return null;
   }
   
   public static void closeConnection(Connection c) {
	   if(c!=null)
		   try {
			   c.close();
		   } catch(SQLException e) {
			   e.printStackTrace();
		   }
   }
   
}
