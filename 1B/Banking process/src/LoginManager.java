// LoginManager.java - Singleton class to manage user login state
public class LoginManager {

    // Static instance of the singleton class
    private static LoginManager instance;

    // Private variables to store login state and user data
    private boolean isLoggedIn;
    private String loggedInUser;

    // Private constructor to prevent instantiation from outside
    private LoginManager() {
        this.isLoggedIn = false;
        this.loggedInUser = null;
    }

    // Method to get the single instance of LoginManager
    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    // Method to log in a user
    public void login(String username) {
        if (!isLoggedIn) {
            this.isLoggedIn = true;
            this.loggedInUser = username;
            System.out.println(username + " successfully logged in.");
        } else {
            System.out.println("User " + loggedInUser + " is already logged in.");
        }
    }

    // Method to log out the current user
    public void logout() {
        if (isLoggedIn) {
            System.out.println(loggedInUser + " successfully logged out.");
            this.isLoggedIn = false;
            this.loggedInUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    // Method to check if a user is logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Method to get the logged-in username
    public String getLoggedInUser() {
        return loggedInUser;
    }
}


