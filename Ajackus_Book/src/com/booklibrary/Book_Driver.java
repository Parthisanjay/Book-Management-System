package com.booklibrary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Book_Driver {
	static Scanner s= new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag=true;
		Map<Integer,Book> lib= new HashMap<>();		// To store Book type of Objects
		Controller c= new Controller();			//Controller reference is used to do CRUD operations with Book
		
		while(flag) {			
			System.out.println("=======BOOK LIBRARY=======");
			System.out.println("\t1.Add Book"
					+ "\n\t2.View Books"
					+ "\n\t3.Search Book"
					+ "\n\t4.Update Book"
					+ "\n\t5.Remove Book"
					+ "\n\t6.Exit");
			int user_option=s.nextInt();
			
			switch(user_option) {
				case 1:{						// Add book
					Book b= c.addbook(lib);
					lib.put(b.getBook_id(), b);
					System.out.println("Book Added Successfully");
					break;
				}
				case 2:{						// View book
					c.viewbook(lib);
					break;
				}
				case 3:{						// Search book
					c.searchbook(lib);
					break;
				}
				case 4:{						//Update book
					Book b=c.updatebook(lib);
					lib.put(b.getBook_id(), b);
					System.out.println("Book Updated Successfully");
					break;
				}
				case 5:{						//Delete book
					c.deletebook(lib);
					break;
				}
				case 6:{						//Close Application
					System.out.println("Application Closed");
					flag=false;
					break;
				}
				default :{
					System.out.println("Invalid Input");
				}	
			}
		}	
	}
}
