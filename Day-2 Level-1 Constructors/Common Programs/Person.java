import java.util.Scanner;

public class Person {
    // Encapsulate attributes of the class
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not specified";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.getName();
        this.age = other.getAge();
        this.address = other.getAddress();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name. Setting default value: 'Unknown'.");
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age. Setting default value: 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            System.out.println("Invalid address. Setting default value: 'Not specified'.");
            this.address = "Not specified";
        } else {
            this.address = address;
        }
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }

    public static void main(String[] args) {
        // Creating the scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input for the first Person object
        System.out.println("Enter details for the original person:");
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        // Consume the newline character
        input.nextLine();

        System.out.print("Address: ");
        String address = input.nextLine();

        // Creating the original Person object using the parameterized constructor
        Person originalPerson = new Person(name, age, address);

        // Displaying the original person's details
        System.out.println("\n Original Person:");
        originalPerson.displayDetails();

        // Creating a new Person object using the copy constructor
        Person clonedPerson = new Person(originalPerson);

        // Displaying the cloned person's details
        System.out.println("\n Cloned Person:");
        clonedPerson.displayDetails();

        // Closing the scanner
        input.close();
    }
}
