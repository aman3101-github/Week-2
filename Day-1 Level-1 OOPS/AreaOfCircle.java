import java.util.Scanner;
public class AreaOfCircle {
	
	// Encapsulating the class attributes
	private double radius;
	
	// Constructor to initialzie the object of the class
	public AreaOfCircle(double radius){
		this.radius = radius;
	}
	
	// Creating method to calculate the area of circle 
	public double calculateArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	// Creating method to calculate the circumference of circle 
	public double calculateCirumference(){
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	// Creating method to display the results
	public void displayResult(){
		double area = calculateArea();
		double circumference = calculateCirumference();
		System.out.println("The area of cirlce of radius " + radius + " is" + area);
		System.out.println("The area of cirlce of radius " + radius +  " is" + circumference);
	}
	
	// Main method
	public static void main(String args[]){
		
		// Creating the scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input for radius parameter
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		// Creating the object for the class
		AreaOfCircle circle = new AreaOfCircle(radius);
		
		// Calling method to print the object details
		circle.displayResult();
		
		// Closing the scanner object
		input.close();
		}
	}