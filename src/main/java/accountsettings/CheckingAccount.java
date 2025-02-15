package accountsettings;

public class CheckingAccount extends Account {
    private double monthlyFee;  // Instance variable to store the monthly fee

    // Constructor to initialize the balance and the monthly fee
    public CheckingAccount(double balance, double monthlyFee) {
        super(balance);  // Call the superclass (Account) constructor to set the balance
        this.monthlyFee = monthlyFee;
    }

    // Method to subtract the monthly fee from the balance
    public void subtractMonthlyFee() {
        double balance = getBalance();  // Get current balance
        setBalance(balance - monthlyFee);  // Subtract the monthly fee from the balance
    }

    // Getter for the monthly fee
    public double getMonthlyFee() {
        return monthlyFee;
    }

    // Setter for the monthly fee
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}