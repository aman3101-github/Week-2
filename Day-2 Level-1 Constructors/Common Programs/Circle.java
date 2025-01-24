public class Circle {
    // Instance Variable
    private double radius;

    // Default constructor - initializing radius to 1.0
    public Circle() {
        this(1.0);  
    }

    // Parameterized constructor - initializing radius with the given value
    public Circle(double radius) {
        this.radius = radius;  
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the details of the circle
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Creating a Circle object with default radius (1.0)
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        // Creating a Circle object with a user-provided radius (5.0)
        Circle customCircle = new Circle(5.0);
        System.out.println("\nCustom Circle:");
        customCircle.displayDetails();

        // Modifying the radius using setter method
        customCircle.setRadius(7.0);
        System.out.println("\nCustom Circle after updating radius:");
        customCircle.displayDetails();
    }
}
