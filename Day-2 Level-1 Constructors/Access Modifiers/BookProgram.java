// File Name: BookProgram.java

// Parent class: Book
class Book {
    // Access Modifiers for different attributes
    public String ISBN;         // Accessible from anywhere
    protected String title;     // Accessible within the class and its subclasses
    private String author;      // Accessible only within the Book class

    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name (getter)
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name (setter)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {

    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author) {
        // Calling the superclass constructor
        super(ISBN, title, author);
    }

    // Method to display EBook details (overriding method)
    @Override
    public void displayDetails() {
        System.out.println("EBook Details:");
        // Calling the superclass method to display common details
        super.displayDetails();
    }

    // Method to access and modify 'title' and 'ISBN' (inherited as protected and public respectively)
    public void updateTitle(String newTitle) {
        // Can access 'title' because it is protected
        title = newTitle;  
    }

    public void displayISBN() {
        // Can access 'ISBN' because it is public
        System.out.println("ISBN: " + ISBN);  
    }
}

// Main class to test the functionality
public class BookProgram {
    public static void main(String[] args) {
        // Creating an instance of Book
        Book book1 = new Book("978", "Ignited Minds", "APJ Abdul Kalam");
        book1.displayDetails();

        // Modifying author name using public method
        book1.setAuthor("SK Verma");
        System.out.println("\nAfter updating author name:");
        book1.displayDetails();

        // Creating an instance of EBook
        EBook eBook1 = new EBook("97814", "Metamorphosis", "Fyodor Dostoevsky");
        eBook1.displayDetails();

        // Accessing and modifying title and ISBN in EBook (via protected and public access)
        eBook1.updateTitle("Metamorphosis");
        eBook1.displayISBN();
        System.out.println("\nAfter updating title:");
        eBook1.displayDetails();
    }
}
