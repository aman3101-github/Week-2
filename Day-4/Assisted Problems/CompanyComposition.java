import java.util.ArrayList;

// Class representing an Employee
class Employee {
    private String name; // Employee name

    // Constructor to initialize Employee name
    public Employee(String name) {
        this.name = name;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
    }
}

// Class representing a Department
class Department {
    private String departmentName; // Department name
    private ArrayList<Employee> employees; // List of employees in the department

    // Constructor to initialize Department name and Employee list
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display department and employee details
    public void displayDetails() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}

// Class representing a Company (composition with Department and Employee)
class Company {
    private String companyName; // Company name
    private ArrayList<Department> departments; // List of departments in the company

    // Constructor to initialize Company name and Department list
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display company details including departments and employees
    public void displayDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDetails();
        }
    }
}

// Main class to demonstrate the composition relationship
public class CompanyComposition {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("Capegemini");

        // Create Departments
        Department department1 = new Department("Civil");
        Department department2 = new Department("Electronics");

        // Create Employees for Civil
        Employee emp1 = new Employee("Aman");
        Employee emp2 = new Employee("Raj");
        department1.addEmployee(emp1);
        department1.addEmployee(emp2);

        // Create Employees for Electronics 
        Employee emp3 = new Employee("Adarsh");
        Employee emp4 = new Employee("Bhagwan");
        department2.addEmployee(emp3);
        department2.addEmployee(emp4);

        // Add Departments to the Company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display Company details
        company.displayDetails();

        // Simulate deleting the company
        System.out.println("\n Deleting the company and all its departments and employees");
        company = null;
        // After this point, departments and employees will no longer exist since they are tied to the company.
    }
}