public class main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount myAccount = new BankAccount("12345", 1000.0);

        // Using public methods to interact with the account
        System.out.println("Account Number: " + myAccount.getAccountNumber());  // Accessing abstracted account number
        System.out.println("Initial Balance: " + myAccount.getBalance());       // Checking balance

        // Perform transactions
        myAccount.deposit(500.0);  // Deposit operation
        myAccount.withdraw(200.0); // Withdrawal operation

        // Check balance after transactions
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
