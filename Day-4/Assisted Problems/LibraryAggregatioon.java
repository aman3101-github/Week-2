import java.util.ArrayList;
import java.util.Scanner;

// Class representing a Book
class Book {
    // Private fields for encapsulation
    private String title;
    private String author;

    // Constructor to initialize book attributes
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // Getter for the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Class representing a Library
class Library {
    // Private field for encapsulation
    private ArrayList<Book> books;

    // Constructor to initialize the ArrayList
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

// Main class to demonstrate aggregation
public class LibraryAggregatioon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        System.out.println("How many books do you want to add to Library 1?");
        int count1 = getPositiveIntegerInput(scanner);

        // Add books to the first library
        for (int i = 0; i < count1; i++) {
            Book book = createBook(scanner);
            library1.addBook(book);
        }

        System.out.println("How many books do you want to add to Library 2?");
        int count2 = getPositiveIntegerInput(scanner);

        // Add books to the second library
        for (int i = 0; i < count2; i++) {
            Book book = createBook(scanner);
            library2.addBook(book);
        }

        // Displaying books in each library
        System.out.println("\nLibrary 1:");
        library1.displayBooks();

        System.out.println("\nLibrary 2:");
        library2.displayBooks();

        scanner.close();
    }

    // Method to create a Book object with user input
    private static Book createBook(Scanner scanner) {
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        return new Book(title, author);
    }

    // Method to get positive integer input from the user
    private static int getPositiveIntegerInput(Scanner scanner) {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return value;
    }
}