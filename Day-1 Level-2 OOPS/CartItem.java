import java.util.Scanner;

public class CartItem {
    // Class attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to update the quantity of an item
    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total cost for the item
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost for this item: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Define the maximum number of items in the cart
        final int MAX_ITEMS = 5;

        // Create an array to store CartItem objects
        CartItem[] cart = new CartItem[MAX_ITEMS];

        int itemCount = 0; // Keep track of number of items in the cart

        // Add items to the cart
        while (itemCount < MAX_ITEMS) {
            System.out.println("Enter item name:");
            String itemName = scanner.nextLine();

            System.out.println("Enter price of " + itemName + ":");
            double price = scanner.nextDouble();

            System.out.println("Enter quantity of " + itemName + ":");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            // Add item to the cart
            cart[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;

            System.out.println("Item added to the cart.\n");

            // Ask if the user wants to add more items
            System.out.println("Do you want to add another item? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        // Display the total cost of the cart
        double totalCost = 0;
        System.out.println("\nCart Details:");
        for (int i = 0; i < itemCount; i++) {
            cart[i].displayItemDetails();
            totalCost += cart[i].calculateTotalCost();
        }

        System.out.println("\nTotal cost of all items in the cart: $" + totalCost);

        // Remove an item from the cart (user input)
        System.out.println("\nDo you want to remove an item from the cart? (yes/no)");
        String removeResponse = scanner.nextLine();
        if (removeResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the item to remove:");
            String itemToRemove = scanner.nextLine();

            boolean itemFound = false;
            for (int i = 0; i < itemCount; i++) {
                if (cart[i].getItemName().equalsIgnoreCase(itemToRemove)) {
                    cart[i] = null; // Remove the item by setting it to null
                    itemFound = true;
                    System.out.println(itemToRemove + " has been removed from the cart.");
                    break;
                }
            }
            if (!itemFound) {
                System.out.println("Item not found in the cart.");
            }
        }

        // Display updated cart details
        System.out.println("\nUpdated Cart Details:");
        totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i] != null) {
                cart[i].displayItemDetails();
                totalCost += cart[i].calculateTotalCost();
            }
        }

        System.out.println("\nUpdated total cost of items in the cart: $" + totalCost);

        // Close the scanner
        scanner.close();
    }
}
