package com.fujitsu.library;

public class AllBook {

	private String Title, Author, Isbn, Genre;
	
	public void saveBook(String Title, String Author, String Isbn, String Genre) 
	{
		this.Title = Title;
		this.Author = Author;
		this.Isbn = Isbn;
		this.Genre = Genre;

		
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	public String getIsbn() {
		return Isbn;
	}
	public void setIsbn(String Isbn) {
		this.Isbn = Isbn;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}
	
	
}
