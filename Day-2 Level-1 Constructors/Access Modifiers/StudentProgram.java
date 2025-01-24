// File Name: Main.java

// Parent class: Student
class Student {
    // Access Modifiers for different attributes
    public int rollNumber;       // Accessible from anywhere
    protected String name;       // Accessible within the class and its subclasses
    private double CGPA;         // Accessible only within the Student class

    // Constructor to initialize Student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA (getter)
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA (setter)
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor to initialize PostgraduateStudent details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        // Calling the superclass constructor
        super(rollNumber, name, CGPA);
    }

    // Method to display PostgraduateStudent details (overriding method)
    @Override
    public void displayDetails() {
        System.out.println("Postgraduate Student Details:");
        // Calling the superclass method
        super.displayDetails();
    }

    // Method to access and modify 'name' (inherited as protected)
    public void changeName(String newName) {
        // Can access 'name' because it is protected
        name = newName;
    }
}

// Main class to test the functionality
public class StudentProgram {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student1 = new Student(21, "Aman Prajapati", 8.70);
        student1.displayDetails();
        
        // Modifying CGPA using public method
        student1.setCGPA(9.2);
        System.out.println("\nAfter updating CGPA:");
        student1.displayDetails();

        // Creating an instance of PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(48, "Bhagwan Singh", 8.20);
        pgStudent.displayDetails();

        // Changing name of the PostgraduateStudent using a method
        pgStudent.changeName("Adarsh");
        System.out.println("\nAfter changing the name:");
        pgStudent.displayDetails();
    }
}
