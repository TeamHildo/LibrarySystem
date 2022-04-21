package com.fujitsu.library;
import java.sql.*;
public class AddBook {
	

        Connection connect;
        org.sqlite.JDBC jdbc = new org.sqlite.JDBC();
		String url = "jdbc:sqlite:C:\\sqlitedb\\mini project\\allbooks.db";
		String result="";
		String genre;
	public String addBooks(String Title, String Author, String Isbn, String Genre) {

		if(Title!=null && Author!=null && Isbn!=null && Genre!=null) {
			try {

	        	connect = DriverManager.getConnection(url);
	        	String newBooks = "insert into addbook(Title,Author,Isbn,Genre)values(?,?,?,?)";
	        	//Statement p = connect.createStatement();
	        	PreparedStatement p = connect.prepareStatement(newBooks);
	        
	        	p.setString(1, Title);
	        	p.setString(2, Author);
	        	p.setString(3, Isbn);
	        	p.setString(4, Genre);
	        	p.executeUpdate();
	        	connect.close();
	} 
	        catch (Exception e) {
	        	e.printStackTrace();
	}
			return result;
		}

		else {
			return null;
		}
	}
	
        
	public String viewBooks() {

		try {
		connect = DriverManager.getConnection(url);
	     //step3 execute sql statement
		String allBooks = "select * from addbook;";	
		PreparedStatement vBooks =	connect.prepareStatement(allBooks);
		 ResultSet rst =  vBooks.executeQuery();
		   while (rst.next()) {
			   
				  
			  result+= "<br>"+rst.getString("title")+ ", "+ rst.getString("author")+ ", "+ rst.getString("isbn")+ ", "+ rst.getString("genre");			   
		   

		   }
		   connect.close();
		} catch (Exception e) {
		e.printStackTrace();
	}
		
		 return result;	 
 }

}
