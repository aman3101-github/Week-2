import java.util.Scanner;

public class HotelBooking {
    // Private attributes of the class
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard Room";
		// Default to one night
        this.nights = 1; 
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = validateNights(nights); 
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Private method to validate nights 
    private int validateNights(int nights) {
        if (nights <= 0) {
            System.out.println("Invalid number of nights. Setting default value to 1.");
            return 1;
        }
        return nights;
    }

    // Getter for guestName
    public String getGuestName() {
        return guestName;
    }

    // Setter for guestName
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter for roomType
    public String getRoomType() {
        return roomType;
    }

    // Setter for roomType
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter for nights
    public int getNights() {
        return nights;
    }

    // Setter for nights with validation
    public void setNights(int nights) {
        this.nights = validateNights(nights);
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the parameterized constructor
        System.out.println("Enter booking details for the first guest:");
        System.out.print("Guest Name: ");
        String guestName = input.nextLine();
        System.out.print("Room Type: ");
        String roomType = input.nextLine();
        System.out.print("Number of Nights: ");
        int nights = input.nextInt();

        // Creating a booking using the parameterized constructor
        HotelBooking originalBooking = new HotelBooking(guestName, roomType, nights);

        // Display the original booking details
        System.out.println("\nOriginal Booking:");
        originalBooking.displayDetails();

        // Taking user input for modifying the copied booking
        input.nextLine(); 
        System.out.println("\nEnter details to modify the copied booking:");
        System.out.print("Guest Name: ");
        String newGuestName = input.nextLine();
        System.out.print("Room Type: ");
        String newRoomType = input.nextLine();
        System.out.print("Number of Nights: ");
        int newNights = input.nextInt();

        // Creating a copy of the booking using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(originalBooking);

        // Modifying the copied booking using setters
        copiedBooking.setGuestName(newGuestName);
        copiedBooking.setRoomType(newRoomType);
        copiedBooking.setNights(newNights);

        // Display the modified copied booking details
        System.out.println("\n Copied Booking (Modified):");
        copiedBooking.displayDetails();

        // Closing the Scanner object to prevent resource leaks
        input.close();
    }
}
