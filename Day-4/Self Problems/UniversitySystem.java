import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the program
public class UniversitySystem {

    public static void main(String[] args) {
        // Create faculty members
        Faculty faculty1 = new Faculty(1, "Dr. S. Singh");
        Faculty faculty2 = new Faculty(2, "Dr. R.K Tiwari");

        // Create a university
        University university = new University("Tech University");

        // Add departments to the university
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Assign faculty to departments
        university.addFacultyToDepartment("Computer Science", faculty1);
        university.addFacultyToDepartment("Mechanical Engineering", faculty2);

        // Display university details
        university.displayUniversityDetails();

        // Display independent faculty details
        System.out.println("Independent Faculty Members:");
        faculty1.displayDetails();
        faculty2.displayDetails();

        // Deleting the university
        System.out.println("\nDeleting the University...");
        university = null;

        System.out.println("All departments have been deleted with the university.");
    }
}

// University class
class University {
    private String name;
    private List<Department> departments;

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add faculty to a department
    public void addFacultyToDepartment(String departmentName, Faculty faculty) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addFaculty(faculty);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    // Display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments and Faculty:");
        for (Department department : departments) {
            department.displayDetails();
        }
        System.out.println();
    }
}

// Department class (Composition relationship with University)
class Department {
    private String name;
    private List<Faculty> facultyMembers;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    // Add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Display department details
    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(" - " + faculty.getName());
        }
    }

    // Getter for department name
    public String getName() {
        return name;
    }
}

// Faculty class (Aggregation relationship with Department)
class Faculty {
    private int id;
    private String name;

    // Constructor
    public Faculty(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display faculty details
    public void displayDetails() {
        System.out.println("Faculty ID: " + id + ", Name: " + name);
    }

    // Getter for faculty name
    public String getName() {
        return name;
    }
}