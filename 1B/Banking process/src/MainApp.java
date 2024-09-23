public class MainApp {
    public static void main(String[] args) {
        // Get the single instance of LoginManager
        LoginManager loginManager = LoginManager.getInstance();

        // Bank account with initial balance
        BankAccount account = new BankAccount(1000.0);

        // Try to view balance without logging in
        account.viewBalance();

        // Login as a user
        loginManager.login("JohnDoe");

        // Perform banking operations
        account.viewBalance();
        account.deposit(500);
        account.withdraw(200);

        // Log out
        loginManager.logout();

        // Try to perform operations after logging out
        account.viewBalance();
        account.deposit(300);
    }
}