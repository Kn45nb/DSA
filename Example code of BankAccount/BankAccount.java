public class BankAccount {
    // Private data members (information hiding)
    private String accountNumber;
    private double balance;
    
    // Constructor to initialize account
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Public method to check the balance
    public double getBalance() {
        return balance;
    }

    // Information hiding: Private data is not exposed directly
    // The account number is private, not directly accessible
    public String getAccountNumber() {
        return accountNumber;
    }
}
