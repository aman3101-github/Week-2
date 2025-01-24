import java.util.Scanner;

public class BookLibrary {

    // Encapsulated attributes of the BookLibrary class
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor initializing default values
    public BookLibrary() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true; 
    }

    // Parameterized constructor for setting book details
    public BookLibrary(String title, String author, double price, boolean isAvailable) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
        this.setAvailability(isAvailable);
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title. Setting default value: 'Unknown Title'.");
            this.title = "Unknown Title";
        } else {
            this.title = title;
        }
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            System.out.println("Invalid author. Setting default value: 'Unknown Author'.");
            this.author = "Unknown Author";
        } else {
            this.author = author;
        }
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price. Setting default value: 0.0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book (check availability)
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // book is now borrowed
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true; // book is now available again
        System.out.println("The book '" + title + "' has been successfully returned.");
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        if (isAvailable()) {
    System.out.println("Availability: Available");
		} 
else {
    System.out.println("Availability: Not Available");
	}

        System.out.println("                           ");
    }

    public static void main(String[] args) {
        // Creating the scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for book details
        System.out.println("Enter details for the book:");

        System.out.print("Title: ");
        String title = input.nextLine();

        System.out.print("Author: ");
        String author = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();

        System.out.print("Is the book available? (true/false): ");
        boolean isAvailable = input.nextBoolean();

        // Creating a BookLibrary object using the parameterized constructor
        BookLibrary libraryBook = new BookLibrary(title, author, price, isAvailable);

        // Displaying the book details
        libraryBook.displayDetails();

        // Borrowing the book
        libraryBook.borrowBook();

        // Displaying updated book details after borrowing
        libraryBook.displayDetails();

        // Returning the book
        libraryBook.returnBook();

        // Displaying updated book details after returning
        libraryBook.displayDetails();

        // Closing the scanner
        input.close();
    }
}
