package com.booklibrary;

public class Book {
	int book_id;				//Book Id
	String book_title;			//Book Title
	String book_author;			//Book Author
	String book_genre;			//Book Genre
	String book_availability;	//Book Availability
	
	//Constructor to initialize instances of Book
	public Book(int book_id, String book_title, String book_author, String book_genre, String book_availability) {
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_genre = book_genre;
		this.book_availability = book_availability;
	}
	
	
	//Getters and Setters methods to get and set values to the instances of Book
	public int getBook_id() {
		return book_id;
	}



	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}



	public String getBook_title() {
		return book_title;
	}



	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}



	public String getBook_author() {
		return book_author;
	}



	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}



	public String getBook_genre() {
		return book_genre;
	}



	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}



	public String getBook_availability() {
		return book_availability;
	}



	public void setBook_availability(String book_availability) {
		this.book_availability = book_availability;
	}



	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_author=" + book_author
				+ ", book_genre=" + book_genre + ", book_availability=" + book_availability + "]";
	}	
}
