package com.fujitsu.sqlitedb;
import java.sql.*;

import com.fujitsu.library.AllBook;

public class BookADV {
		 String result="";
		
	
	public int saveBooks(AllBook books) 
	{
        //if ito yong gagamitin.. nakakapg add sa database
		/*if(Title!=null && Author!=null && Isbn!=null && Genre!=null) 
		{
			try {

	        	Connection connect =sqliteConnect.getConnnect();
	        	String newBooks = "insert into addbook(Title,Author,Isbn,Genre)values(?,?,?,?)";
	        	PreparedStatement p = connect.prepareStatement(newBooks);
	        
	        	p.setString(1, Title);
	        	p.setString(2, Author);
	        	p.setString(3, Isbn);
	        	p.setString(4, Genre);
	        	p.executeUpdate();
	        	
	        	connect.close();
				} 
	        catch (Exception e)
			{
	        	e.printStackTrace();
	        }
			return result;
			}
			*/
		
		//if ito yong gagamitin.. walang naaadd sa database
		int i = 0;
			try {

				
	        	Connection connect =sqliteConnect.getConnnect();
	        	String newBooks = "insert into addbook(Title,Author,Isbn,Genre)values(?,?,?,?)";
	        	PreparedStatement p = connect.prepareStatement(newBooks);
	        
	        	p.setString(1, books.getTitle());
	        	p.setString(2, books.getAuthor());
	        	p.setString(3, books.getIsbn());
	        	p.setString(4, books.getGenre());
	        	i = p.executeUpdate();
	        	
	        	connect.close();
				} 
	        catch (Exception e)
			{
	        	e.printStackTrace();
	        }
			return i;
		
	}
	
        
	public  String viewBooks() {

		try {

			Connection connect =sqliteConnect.getConnnect();
			String allBooks = "select * from addbook;";	
			PreparedStatement p =	connect.prepareStatement(allBooks);
			ResultSet rst =  p.executeQuery();
		   while (rst.next()) {
			   
			   result+= "<br>"+rst.getString("title")+ ", "+ rst.getString("author")+ ", "+ rst.getString("isbn")+ ", "+ rst.getString("genre");
				  
			  }
		   connect.close();
		} catch (Exception e) {
		e.printStackTrace();
	}
		
		 return result;	 
 }
	
	/*public  String viewBooks() {

		try {

			Connection connect =sqliteConnect.getConnnect();
			String allBooks = "select * from addbook;";	
			PreparedStatement p =	connect.prepareStatement(allBooks);
			ResultSet rst =  p.executeQuery();
		   while (rst.next()) {
			   
				  
			  result+= "<br>"+rst.getString("title")+ ", "+ rst.getString("author")+ ", "+ rst.getString("isbn")+ ", "+ rst.getString("genre");			   
		   

		   }
		   connect.close();
		} catch (Exception e) {
		e.printStackTrace();
	}
		
		 return result;	 
 }*/

}
