# Book-Management-System
Digital Library Book Management System

Description

This is a simple Library Management System implemented in Java. It allows users to perform CRUD (Create, Read, Update, Delete) operations on books, including adding, viewing, searching, updating, and deleting books from the library.

Features:

-->Add new books to the library

-->View all books

-->Search for books by ID or Title

-->Update book details

-->Delete books from the library

-->User-friendly console-based interface

Implementation of Classes
      There are 3 classes
        1.Book
        2.Controller
        3.Book_Driver

Book class

  --> It is an Entity class
  
  --> Constructor to initialize instances of Book
  
  --> Getter and Setter methods to get and set values
  
  --> Getter and Setter methods to get and set values
  
  --> toString method is overrided to print Book object values.

Controller class

  --> Used for CRUD operations
    
  --> Exception handled and input datas are validated
    
  --> There are 7 Methods in this class
 
  addbook()      --> To add new Book
    
  viewbook()     --> To view all the Stored Books
    
  searchbook()   --> To Search a Book by using Id or Title
    
  updatebook()   --> To Update fields of Book
    
  deletebook()   --> To Delete a Book
    
  valid_id()     --> To check Bood id whether it is Unique or Not
    
  book_details() --> To validate and get details from the user

Book_Driver class

  --> It is the Main class for this application

  --> main() method is presence in this class 

  -->To display user friendly console based interface
      
      
      
