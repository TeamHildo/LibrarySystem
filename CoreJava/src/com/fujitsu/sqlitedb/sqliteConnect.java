package com.fujitsu.sqlitedb;

import java.sql.*;

public class sqliteConnect {
public static Connection getConnnect(){

	Connection connect = null;
	try{
	    
	    org.sqlite.JDBC jdbc = new org.sqlite.JDBC();
		String url = "jdbc:sqlite:C:\\sqlitedb\\mini project\\allbooks.db";
		connect = DriverManager.getConnection(url);
		
	}catch(Exception e){System.out.println(e);}
	return connect;
}
}