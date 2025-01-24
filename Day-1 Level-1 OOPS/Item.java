import java.util.Scanner;

public class Item{
	// Encapsulated fields of the class
	private int itemCode;
	private String itemName;
	private int price;
	private int quantity;
	
	// Instansiating the object by creating the constructor 
	public Item(int itemCode, String itemName, int price, int quantity){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}	
	
	// Creating the method to calculate the total cost for a given quantity of item
	public int totalCost(){
		int cost = price * quantity;
		return cost;
	}
	
	// Creating method to display the result 
	public void displayResult(){
		int cost = totalCost();
		System.out.println("The item code of the product: " + itemCode);
		System.out.println("The item name of the product: " + itemName);
		System.out.println("The per item price of the product: " + price);
		System.out.println("The total cost of the item for quantity of " + quantity + ": " + cost);
	}
	
	
	// Main method 
	public static void main(String args[]){
		// Creating the scanner object 
		Scanner input = new Scanner(System.in);
		
		// Taking user input for the item details
		System.out.print("Enter the item code: ");
		int itemCode = input.nextInt();
		
		System.out.print("Enter the name of the item: ");
		String itemName = input.next();
		
		System.out.print("Enter the price of unit item: ");
		int price = input.nextInt();
		
		System.out.print("Enter the quantity of the item: ");
		int quantity = input.nextInt();
		
		// Creating the instance of the Item class 
		Item itemDetails = new Item(itemCode, itemName, price, quantity);
		
		// Calling method to class instance to display the item details
		itemDetails.displayResult();
		
		// Closing the scanner object
		input.close();
		}
	}