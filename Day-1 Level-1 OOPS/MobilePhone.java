import java.util.Scanner;

public class MobilePhone {
	
	// Encapsulated attributes of the class
	private String brand;
	private String model; 
	private int price;
	
	// Instansiated the object by creating the constructor 
	public MobilePhone(String brand, String model, int price){
	    this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// Method to display the details of the Mobile Phone 
	
	public void displayResult(){
		
		System.out.println("The details of the mobile phone - ");
		System.out.println("Mobile brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price of mobile phone: " + price);
	}
	
	// Main method
	public static void main(String args[]){
		// Creating the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking the user input
		System.out.print("Enter the mobile brand: ");
		String brand = input.next();
		
		// Consume the leftover newline character
        input.nextLine(); // This ensures the input buffer is cleared
		
		System.out.print("Enter the mobile model: ");
		String model = input.nextLine();
		
		System.out.print("Enter the mobile phone price: ");
		int price = input.nextInt();
		
		// Consume the leftover newline character
        input.nextLine(); // This ensures the input buffer is cleared
		
		// Creating the instance of the class MobilePhone
		MobilePhone mobilehandle = new MobilePhone(brand, model, price);
		
		// Calling the method to object of MobilePhone class to display the results 
		mobilehandle.displayResult();
		
		// Closing the scanner object
		input.close();
	
		}	
	}