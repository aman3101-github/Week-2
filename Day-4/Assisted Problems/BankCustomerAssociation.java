import java.util.ArrayList;

// Class representing a Customer
class Customer {
    private String name; // Customer's name
    private ArrayList<Account> accounts; // List of accounts held by the customer

    // Constructor to initialize customer's name
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view the balance of all accounts
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}

// Class representing a Bank
class Bank {
    private String bankName; // Name of the bank
    private ArrayList<Customer> customers; // List of customers associated with the bank

    // Constructor to initialize bank name
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
    }

    // Method to display details of all customers and their accounts
    public void displayCustomerDetails() {
        System.out.println("Bank: " + bankName);
        for (Customer customer : customers) {
            customer.viewBalance();
        }
    }
}

// Class representing a Bank Account
class Account {
    private String accountNumber; // Account number
    private double balance; // Account balance

    // Constructor to initialize account details
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// Main class to demonstrate Bank-Customer association
public class BankCustomerAssociation {
    public static void main(String[] args) {
        // Create a Bank
        Bank bank = new Bank("ABC Bank");

        // Create Customers
        Customer customer1 = new Customer("Aman");
        Customer customer2 = new Customer("Adarsh");

        // Add Customers to the Bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Create and Add Accounts to Customers
        Account account1 = new Account("123456", 1000.50);
        Account account2 = new Account("789012", 2500.75);

        bank.openAccount(customer1, account1);
        bank.openAccount(customer2, account2);

        // Display Bank Customers and their Accounts
        bank.displayCustomerDetails();
    }
}