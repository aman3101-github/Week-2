import java.util.Scanner;

public class Student {
	
	// Encapsulated attributes of the class
	private String name;
	private int rollNumber;
	private int marks;
	private char grade;
	
	// Initialzie the object by creating constructor
	public Student(String name, int rollNumber, int marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
		// Calculate grade during initialization
		this.grade = gradeCalculator();
	}
	
	// Creating method to calculate the marks 
	public char gradeCalculator(){
		if(marks >= 80){
			return 'A';
		}
		else if(marks >= 60){
			return 'B';
		}
		else if(marks >= 50){
			return 'C';
		}
		else if(marks >= 39){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	
	// Creating method to display results
	public void displayResult(){
		System.out.println("\n STUDENT'S DETAILS");
		System.out.println("\n Student's Name: " + name);
		System.out.println("\n Student's Roll Number: " + rollNumber);
		System.out.println("\n Student's marks: " + marks);
		System.out.println("\n Student's Grade: " + gradeCalculator());
	}
	
	// Main method
	public static void main(String args[]){
		// Creating the scanner object 
		Scanner input = new Scanner(System.in);
		
		// Taking user input for the attributes
		System.out.print("Enter the student's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter the student's roll number: ");
		int rollNumber = input.nextInt();
		
		System.out.print("Enter the student's marks: ");
		int marks = input.nextInt();
		
		// Creating the instance of the Student class
		Student studentDetails = new Student(name, rollNumber, marks);
		
		// Calling the method to the object to display results
		studentDetails.displayResult();
		
		
		}	
	
	}