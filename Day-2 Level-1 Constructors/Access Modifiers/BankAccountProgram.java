// File Name: Main.java

// Parent class: BankAccount
class BankAccount {
    // Access Modifiers for different attributes
    public String accountNumber; // Accessible from anywhere
    protected String accountHolder; // Accessible within the class and its subclasses
    private double balance; // Accessible only within the BankAccount class

    // Constructor to initialize BankAccount details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access balance (getter)
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance (setter)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    // Constructor to initialize SavingsAccount details
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        // Calling the superclass constructor
        super(accountNumber, accountHolder, balance);
    }

    // Method to display SavingsAccount details (overriding method)
    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        // Calling the superclass method to display common details
        super.displayAccountDetails();
    }

    // Method to access and modify 'accountHolder' and 'accountNumber' (inherited as protected and public respectively)
    public void updateAccountHolder(String newHolder) {
        // Can access 'accountHolder' because it is protected
        accountHolder = newHolder;
    }

    public void displayAccountNumber() {
        // Can access 'accountNumber' because it is public
        System.out.println("Account Number: " + accountNumber);
    }
}

// Main class with the entry point
public class BankAccountProgram {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("12345", "Alice", 5000.0);

        // Display account details
        savingsAccount.displayAccountDetails();

        // Update the account holder
        savingsAccount.updateAccountHolder("Bob");

        // Display the updated account holder
        System.out.println("\nAfter updating account holder:");
        savingsAccount.displayAccountDetails();

        // Display account number using the public method
        System.out.println("\nAccessing account number directly:");
        savingsAccount.displayAccountNumber();

        // Access and modify balance using getter and setter
        System.out.println("\nBalance: " + savingsAccount.getBalance());
        savingsAccount.setBalance(7000.0);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
}
