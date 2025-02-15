package accountsettings;

public class SavingsAccount extends Account {
    private double interestRate;  // Instance variable for the interest rate (e.g., 0.01 for 1%)
    private double monthlyInterestPayment;  // Instance variable to store the calculated monthly interest payment

    // Constructor to initialize the balance and the interest rate
    public SavingsAccount(double balance, double interestRate) {
        super(balance);  // Call the superclass (Account) constructor to set the balance
        this.interestRate = interestRate;
        this.monthlyInterestPayment = 0.0;  // Initialize interest payment to 0
    }

    // Method to calculate monthly interest based on the balance and interest rate
    public void calculateMonthlyInterest() {
        this.monthlyInterestPayment = getBalance() * interestRate;  // Calculate interest payment
        double newBalance = getBalance() + monthlyInterestPayment;  // Add the interest to the balance
        setBalance(newBalance);  // Update the balance with the interest added
    }

    // Getter for the monthly interest payment
    public double getMonthlyInterestPayment() {
        return monthlyInterestPayment;
    }

    // Setter for the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter for the interest rate
    public double getInterestRate() {
        return interestRate;
    }
}