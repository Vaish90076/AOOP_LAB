class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to view balance (only if logged in)
    public void viewBalance() {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Balance for " + loginManager.getLoggedInUser() + ": $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    // Method to deposit money (only if logged in)
    public void deposit(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Method to withdraw money (only if logged in)
    public void withdraw(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
