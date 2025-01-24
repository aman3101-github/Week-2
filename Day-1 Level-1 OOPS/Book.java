import java.util.Scanner;

public class Book{

// Encapsulated class attributes
private String title;
private String author;
private int price;

// Creating constructor to initialize the object
public Book(String title, String author, int price){
	this.title = title;
	this.author = author;
	this.price = price;
}

// Creating method to display the book details
public void displayResult(){
	System.out.println("The title of the book: " + title);
	System.out.println("The author of the book: " + author);
	System.out.println("The price of the book: Rs." + price);
}

// Main method 
public static void main(String args[]){
	// Creating scanner object 
	Scanner input = new Scanner(System.in);
	
	// Taking user input for book details
	System.out.print("Enter the Book title name: ");
	String title = input.nextLine();
	
	System.out.print("Enter the author's name: ");
	String author = input.nextLine();
	
	System.out.print("Enter the price of the book: ");
	int price = input.nextInt();
	
	// Creating instance of Books class
	Book bookDetails = new Book(title, author, price);
	
	// Calling the method to display the book details 
	bookDetails.displayResult();
	
	// Closing the scanner object
	input.close();
	 }
	
}