public class Vehicle {

    // Instance Variables 
    private String ownerName;
    private String vehicleType;

    // Class Variable (shared among all vehicles)
    private static double registrationFee = 2500.00; 

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display details of a specific vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
        System.out.println("                                ");
    }

    // Class Method: Update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        // Creating vehicles
        Vehicle vehicle1 = new Vehicle("Aman Prajapati", "Car");
        Vehicle vehicle2 = new Vehicle("Adarsh ", "Bike");

        // Displaying vehicle details before updating the registration fee
        System.out.println("Vehicle details before updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(3000.00);

        // Displaying vehicle details after updating the registration fee
        System.out.println("Vehicle details after updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
