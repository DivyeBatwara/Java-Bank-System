/**
 * Represents a single bank account.
 * This class encapsulates the account data and operations.
 */
public class BankAccount {

    // --- 1. Attributes (Instance Variables) ---
    // These are 'private' to protect them from outside direct access (Encapsulation).
    private String accountNumber;
    private String ownerName;
    private double balance;

    // --- 2. Constructor ---
    // This method is called when a new BankAccount object is created.
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        // Ensure the initial balance is not negative.
        this.balance = Math.max(0, initialBalance);
    }

    // --- 3. Methods (Behaviors) ---

    /**
     * Deposits a specified amount into the account.
     * @param amount The amount to deposit. Must be positive.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws a specified amount from the account.
     * @param amount The amount to withdraw. Must be positive and not exceed the balance.
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed. Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    /**
     * Returns the current account balance.
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Displays the account holder's details.
     */
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: $%.2f\n", balance);
        System.out.println("-----------------------");
    }
}
