import java.util.Scanner;

public class Book {

    // Encapsulated attributes of class
    private String title;
    private String author;
    private double price;

    // Default constructor - initializes with default values
    public Book() {
        this.title = "Metamorphosis";
        this.author = "Fyodor Dostoevsky";
        this.price = 1500.00;
    }

    // Parameterized constructor - initializes with user provided values
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
		// Validate the price
        this.price = validatePrice(price); 
    }

    // Private method to validate price
    private double validatePrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid price. Setting default value to 1500.00.");
            return 1500.00;
        }
        return price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("                    ");
    }

    public static void main(String[] args) {
        // Creating the Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the parameterized constructor
        System.out.println("Enter book title:");
        String userTitle = input.nextLine();

        System.out.println("Enter book author:");
        String userAuthor = input.nextLine();

        System.out.println("Enter book price:");
        double userPrice = input.nextDouble();

        // Creating an object using the default constructor
        System.out.println("\nDetails of Default Book:");
        Book defaultBook = new Book();
        defaultBook.displayBookDetails();

        // Creating an object using the parameterized constructor
        System.out.println("\nDetails of User-Entered Book:");
        Book userBook = new Book(userTitle, userAuthor, userPrice);
        userBook.displayBookDetails();

        // Closing the Scanner object
        input.close();
    }
}
