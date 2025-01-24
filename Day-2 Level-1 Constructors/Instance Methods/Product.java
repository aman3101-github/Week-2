public class Product {

    // Instance Variables 
    private String productName;
    private double price;

    // Class Variable 
	// Keeps track of the total number of products created
    private static int totalProducts = 0; 

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    // Instance Method: Display details of a specific product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
        System.out.println("                               ");
    }

    // Class Method: Display total number of products created 
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 5000.00);
        Product product2 = new Product("Smartphone", 1200.00);

        // Display details of individual products
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Display total products created
        Product.displayTotalProducts();
    }
}
