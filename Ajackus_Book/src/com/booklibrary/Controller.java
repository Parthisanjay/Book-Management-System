package com.booklibrary;

import java.util.Map;
import java.util.Scanner;

public class Controller {
	 Scanner s= new Scanner(System.in);
	
	int b_id;						//Book Id
	int user_option;				//Get input from user for Multiple options
	String b_title;					//Book Title
	String b_author;				//Book Author
	String b_genre;					//Book Genre
	String b_availability;	
	boolean accesskey;//Book Availability
	
	public Book addbook(Map<Integer,Book> lib) {	//Add book
		accesskey=false;
		b_id= valid_id(lib); //To generate new id and check whether Book id is already present or not
		bookdetails();
		
		 return new Book(b_id,b_title,b_author,b_genre,b_availability);	
	}
	
	public void viewbook(Map<Integer,Book> lib) {  //To view details of all the stored books

		for(Book b:lib.values()) {
			System.out.println(b);
		}
	}
	
	public void searchbook(Map<Integer,Book> lib) {	//To search a book by using Id or Title
		int key;			//book id input from user
		String value;		//Title input from user
		if(lib.isEmpty())
			System.out.println("No books available");
		else {
			while(true) {
				System.out.println("Search By Id or Title"
						+ "\n1.Id"
						+ "\n2.Title");
				user_option=s.nextInt();
				if(user_option==1) {			//Search book by using Id
					accesskey=true;
					key=valid_id(lib);
					System.out.println(lib.get(key));
					break;
				}
				else if(user_option==2) {		//Search book by using Title
					s.nextLine();
					boolean found=false;
					System.out.println("Enter the Title");
					value=s.nextLine();
					for(Book b: lib.values()) {
						if(value.equalsIgnoreCase(b.getBook_title())) {
							System.out.println(b);
							found=true;
							break;
						}
					}
					if(!found)
						System.out.println("Title Not found");
					else
						break;
					
				}
				else
					System.out.println("Invalid input...Try again");
			}			
		}
		
	}
	
	public Book updatebook(Map<Integer,Book> lib) {	//To update details of already stored book
		accesskey=true;
		b_id=valid_id(lib);		//To check whether book id is valid or not
		System.out.println("Update the Fields");
		System.out.println("=================");
		bookdetails();
		return new Book(b_id,b_title,b_author,b_genre,b_availability);	
	}
	
	public void deletebook(Map<Integer,Book> lib) { // To delete book in the collections						
		accesskey=true;
		b_id=valid_id(lib);	//To check book id is valid or not
		lib.remove(b_id);
		System.out.println("Book Removed Successfully");
	}
	
	public int valid_id(Map<Integer,Book> lib) {  //Book id validation for all CRUD operations
		while(true) {
			try {
				System.out.println("Enter the Book Id");
				b_id=s.nextInt();
				if(!lib.containsKey(b_id) && accesskey) {	//Search,Update,Delete
					throw new IllegalArgumentException("Book ID Not exists Try again!!!");
				}
				else if(lib.containsKey(b_id) && lib.get(b_id)!=null && !accesskey) {	// Create
					throw new IllegalArgumentException("Book ID already exists Try again!!!");
				}
			s.nextLine();
				break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return b_id;
	}
	
	public void bookdetails() {		//Validate and get input from users to Create/Update
		while(true){							//Check validation of user input Title/Author/Genre
			try {
				System.out.println("Enter the Book Title");
				b_title=s.nextLine();
				System.out.println("Enter the Author Name");
				b_author=s.nextLine();
				System.out.println("Enter Book Genre");
				b_genre=s.nextLine();
				if(b_title.equals("")||b_author.equals("")||b_genre.equals(""))
					throw new IllegalArgumentException("Book Title/Author Name/Genre shouldn't be Empty!!!..Try gain");

				break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		
		while(true) {					//To choose Availability status(Available/Checked out)
			System.out.println("Enter the Book Availability"
					+ "\n1.Available"
					+ "\n2.Checked Out");
			int user_option=s.nextInt();
			if(user_option==1) {
				b_availability="Available";
				break;
				}
			else if(user_option==2) {
				b_availability="Checked Out";
				break;
			}
			else {
				System.out.println("Invalid input...Try again");
			}
		}
	}
}
