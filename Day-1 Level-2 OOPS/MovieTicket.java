public class MovieTicket {
    // Class attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the MovieTicket object
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Bond: No Time to Die", "A10", 15.99);
        
        // Display initial ticket details
        ticket.displayTicketDetails();
        
        // Book a new ticket with a different seat and price
        ticket.bookTicket("B5", 20.99);
        
        // Display updated ticket details
        ticket.displayTicketDetails();
    }
}
