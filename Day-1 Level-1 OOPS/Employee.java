public class Employee {
	
	// Attributes for the employee class
	private String name;
	private int id;
	private double salary;
	
	// Initializing the object using the constructor 
	public Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	// Creating method to display the details
	public void displayDetails(){
		System.out.print("Employee details");
		System.out.print("\n Employee name: " + name);
		System.out.print("\n Employee id: " + id);
		System.out.print("\n Employee salary: " + salary);
	}
	
	// Main method
	public static void main(String args[]){
		
		// Creating the object 'emp' for the Employee class
		Employee emp = new Employee("Aman", 101, 750000);
	
		// Calling the method to print the object details
		emp.displayDetails();
		}
	}