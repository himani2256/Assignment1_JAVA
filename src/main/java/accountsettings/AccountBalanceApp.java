package accountsettings;

import java.util.Scanner;

public class AccountBalanceApp {
    public static void main(String[] args) {
        // Create Checking and Savings accounts with initial balances
        CheckingAccount checking = new CheckingAccount(1000.00, 1.00);  // $1000 balance and $1 fee
        SavingsAccount savings = new SavingsAccount(1000.00, 0.012);  // $1000 balance and 1.2% interest rate

        // Display starting balances
        System.out.println("Welcome to the Account application");
        System.out.println("Starting Balances");
        System.out.printf("Checking: $%.2f\n", checking.getBalance());
        System.out.printf("Savings: $%.2f\n", savings.getBalance());

        // Get transactions for the month
        Scanner scanner = new Scanner(System.in);
        String continueTransactions = "y";

        while (continueTransactions.equalsIgnoreCase("y")) {
            System.out.println("\nEnter the transactions for the month");

            System.out.print("Withdrawal or deposit? (w/d): ");
            String transactionType = scanner.nextLine();

            System.out.print("Checking or savings? (c/s): ");
            String accountType = scanner.nextLine();

            System.out.print("Amount?: ");
            double amount = Double.parseDouble(scanner.nextLine());

            // Perform the transaction based on user input
            if (transactionType.equalsIgnoreCase("w")) {
                if (accountType.equalsIgnoreCase("c")) {
                    checking.withdraw(amount);
                } else if (accountType.equalsIgnoreCase("s")) {
                    savings.withdraw(amount);
                }
            } else if (transactionType.equalsIgnoreCase("d")) {
                if (accountType.equalsIgnoreCase("c")) {
                    checking.deposit(amount);
                } else if (accountType.equalsIgnoreCase("s")) {
                    savings.deposit(amount);
                }
            }

            // Ask if the user wants to continue
            System.out.print("Continue? (y/n): ");
            continueTransactions = scanner.nextLine();
        }

        // Apply monthly payments and fees
        checking.subtractMonthlyFee();  // Subtract checking fee
        savings.calculateMonthlyInterest();  // Calculate savings interest

        // Display monthly fees and interest payments
        System.out.println("\nMonthly Payments and Fees");
        System.out.printf("Checking fee: $%.2f\n", checking.getMonthlyFee());
        System.out.printf("Savings interest payment: $%.2f\n", savings.getMonthlyInterestPayment());

        // Display final balances
        System.out.println("\nFinal Balances");
        System.out.printf("Checking: $%.2f\n", checking.getBalance());
        System.out.printf("Savings: $%.2f\n", savings.getBalance());
    }
}