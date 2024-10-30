package com.busreservation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
    
	final static String url;
	final static String username; 
	final static String password;
	
	static {
	    
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		

		url = "jdbc:mysql://localhost:3306/bus_reservation2";
		username = "root";
		password = "12R@hit03";

//
//		String url = "jdbc:mysql://localhost:3306/bus_reservation";
//
//		try {
//			conn =  DriverManager.getConnection(url, "root", "12R@hit03");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
    
	static Connection createConnection() throws SQLException {	
		return DriverManager.getConnection(url, username, password);
	}
	
	static void closeConnection(Connection con) throws SQLException {
		if(con != null) {
            con.close();
		}	
	}
}


