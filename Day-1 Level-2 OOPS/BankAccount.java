import java.util.Scanner;

public class BankAccount {

    // Encapsulated class attributes 
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Initializing the object by creating the constructor 
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {

        // Creating the scanner object 
        Scanner input = new Scanner(System.in);

        // Taking the user input for the Account Holder details
        System.out.print("Enter Account Holder's Name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter Account Balance: ");
        double balance = input.nextDouble();

        // Creating the instance of the class BankAccount
        BankAccount accountDetails = new BankAccount(accountHolder, accountNumber, balance);

        // Simulate basic ATM operations
        while (true) {
            System.out.println("\nATM Options:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    accountDetails.deposit(depositAmount);
                    break;
                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    accountDetails.withdraw(withdrawAmount);
                    break;
                case 3: // Display Balance
                    accountDetails.displayBalance();
                    break;
                case 4: // Exit
                    System.out.println("Exiting ATM. Thank you!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
