<%@ page import="com.fujitsu.library.*"
import="com.fujitsu.sqlitedb.*"
   language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library-Manage Book</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="assets/css/ManageBook.css">
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Library System</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="homepage.jsp">Home</a></li>
      <li><a href="Borrow.jsp">Borrow</a></li>
      <li class="active"><a href="ManageBook.jsp">Manage Book</a></li>
      <li><a href="ManageBorrower.jsp">Manage Borrower</a></li>
      <li><a href="BookList.jsp">Books</a></li>
      <li><a href="About.jsp">About</a></li>
      <li class="logout"><a href="" style="color: #f2f2f2">Log out</a></li>
    </ul>
  </div>
</nav>
<br><br><br><br>
	<form>
		<p>Add or Remove Book from Inventory</p><hr>
		
		
		<input type="text" placeholder="Title" name="title" required id="title"/><br>
     <input type="text" placeholder="Author" name="author" required id="author"/><br>
     <input type="text" placeholder="ISBN" name="ISBN"  id="ISBN"/><br>
		<select name="Genre" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
		  <option selected>Genre</option>
		  <option value="Literary Fiction">Literary Fiction</option>
		  <option value="Horror">Horror</option>
		  <option value="Fantasy">Fantasy</option>
		  <option value="Classics">Classics</option>
		  <option value="Detective and Mystery">Detective and Mystery</option>
		  <option value="Science Fiction">Science Fiction</option>
		</select>
		<hr class="hr1">
		<input class="removeBtn" type="cancel" value="Remove" id="remove" onclick=""/>
		<input class="addBtn" type="submit" value="Add" id="add" onclick=""/> <br>
		
	</form>
</body>
</html>
<%
  
String bookTitle = request.getParameter("title");
String bookAuthor = request.getParameter("author");
String bookIsbn = request.getParameter("ISBN");
String bookGenre = request.getParameter("Genre");
BookADV newBooks = new BookADV();
//newBooks.saveBooks(bookTitle, bookAuthor, bookIsbn, bookGenre);
//out.println(newBooks.viewBooks());
AllBook nBook = new AllBook();

nBook.saveBook(bookTitle,bookAuthor,bookIsbn,bookGenre);
newBooks.saveBooks(nBook);

%>