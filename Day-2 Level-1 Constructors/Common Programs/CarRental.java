import java.util.Scanner;

public class CarRental {

    // Encapsulated attributes for the car rental system
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double dailyRental = 5000.0; 

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRental;
    }

    // Method to display the rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
        System.out.println("                             ");
    }

    public static void main(String[] args) {
        // Creating the scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the rental details
        System.out.println("Enter customer name:");
        String customerName = input.nextLine();

        System.out.println("Enter car model:");
        String carModel = input.nextLine();

        System.out.println("Enter rental days:");
        int rentalDays = input.nextInt();

        // Creating a CarRental object using the parameterized constructor
        CarRental rental = new CarRental(customerName, carModel, rentalDays);

        // Displaying the rental details
        rental.displayRentalDetails();

        // Closing the scanner
        input.close();
    }
}
