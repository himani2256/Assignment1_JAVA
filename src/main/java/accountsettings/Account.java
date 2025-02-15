package accountsettings;

public class Account implements Depositable, Withdrawable, Balanceable {
    private double balance;  // Instance variable to store the account balance

    // Constructor to initialize the balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Implement the deposit method from Depositable interface
    @Override
    public void deposit(double amount) {
        balance += amount;  // Adds the deposit amount to the balance
    }

    // Implement the withdraw method from Withdrawable interface
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;  // Subtracts the withdrawal amount from the balance
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Implement the getBalance method from Balanceable interface
    @Override
    public double getBalance() {
        return balance;  // Returns the current balance
    }

    // Implement the setBalance method from Balanceable interface
    @Override
    public void setBalance(double amount) {
        this.balance = amount;  // Sets the balance to a specific amount
    }
}