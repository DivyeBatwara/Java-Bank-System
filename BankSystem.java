import java.util.Scanner;

/**
 * This class runs the bank simulation.
 * It handles user interaction and uses the BankAccount class.
 */
public class BankSystem {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);

        // --- Create a BankAccount object ---
        // We are creating an instance of our BankAccount class.
        BankAccount myAccount = new BankAccount("123456789", "Divye Batwara", 1000.00);

        System.out.println("Welcome to the Simple Banking System!");
        myAccount.displayAccountDetails();

        int choice;

        // --- Main Application Loop ---
        do {
            // Display the menu to the user.
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            // --- Process the user's choice ---
            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3: // Check Balance
                    myAccount.displayAccountDetails();
                    break;
                case 4: // Exit
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }

        } while (choice != 4);

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}