// File Name: Main.java

// Parent class: Employee
class Employee {
    // Access Modifiers for different attributes
    public int employeeID; // Accessible from anywhere
    protected String department; // Accessible within the class and its subclasses
    private double salary; // Accessible only within the Employee class

    // Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to access salary (getter)
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary (setter)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {

    // Constructor to initialize Manager details
    public Manager(int employeeID, String department, double salary) {
        // Calling the superclass constructor
        super(employeeID, department, salary);
    }

    // Method to display Manager details (overriding method)
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Manager Details:");
        // Calling the superclass method to display common details
        super.displayEmployeeDetails();
    }

    // Method to access and modify 'department' and 'employeeID' (inherited as protected and public respectively)
    public void changeDepartment(String newDepartment) {
        department = newDepartment;  // Can access 'department' because it is protected
    }

    public void displayEmployeeID() {
        System.out.println("Employee ID: " + employeeID);  // Can access 'employeeID' because it is public
    }
}

// Main class to test the functionality
public class EmployeeProgram {
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee employee1 = new Employee(20, "HR", 50000.00);
        employee1.displayEmployeeDetails();

        // Modifying salary using public method
        employee1.setSalary(55000.00);
        System.out.println("\nAfter updating salary:");
        employee1.displayEmployeeDetails();

        // Creating an instance of Manager
        Manager manager1 = new Manager(55, "Tech Lead", 80000.00);
        manager1.displayEmployeeDetails();

        // Accessing and modifying department (via protected access)
        manager1.changeDepartment("Marketing");
        System.out.println("\nAfter changing the department:");
        manager1.displayEmployeeDetails();

        // Accessing and displaying employeeID (via public access)
        manager1.displayEmployeeID();
    }
}
