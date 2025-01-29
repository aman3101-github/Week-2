import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the e-commerce platform
public class ECommercePlatform {

    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(102, "Smartphone", 699.99);
        Product product3 = new Product(103, "Headphones", 199.99);

        // Create a customer
        Customer customer = new Customer(1, "Aman");

        // Customer places an order
        Order order = customer.placeOrder();
        order.addProduct(product1);
        order.addProduct(product2);

        // Customer places another order
        Order anotherOrder = customer.placeOrder();
        anotherOrder.addProduct(product3);

        // Display all customer orders and their details
        customer.displayCustomerDetails();
    }
}

// Customer class
class Customer {
    private int customerId;
    private String customerName;
    private List<Order> orders;

    // Constructor
    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Place a new order
    public Order placeOrder() {
        Order newOrder = new Order(this);
        orders.add(newOrder);
        System.out.println(customerName + " placed a new order. Order ID: " + newOrder.getOrderId());
        return newOrder;
    }

    // Display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId + ", Name: " + customerName);
        System.out.println("Orders placed:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }
}

// Order class
class Order {
    private static int orderCounter = 1; // To generate unique order IDs
    private int orderId;
    private Customer customer;
    private List<Product> products;

    // Constructor
    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product to Order ID " + orderId + ": " + product.getProductName());
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + " (Customer: " + customer.getCustomerName() + ")");
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println(" - " + product.getProductName() + " ($" + product.getProductPrice() + ")");
        }
    }

    // Getter for order ID
    public int getOrderId() {
        return orderId;
    }
}

// Product class
class Product {
    private int productId;
    private String productName;
    private double productPrice;

    // Constructor
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Getter for product name
    public String getProductName() {
        return productName;
    }

    // Getter for product price
    public double getProductPrice() {
        return productPrice;
    }
}
