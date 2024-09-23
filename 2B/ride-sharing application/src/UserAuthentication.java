// UserAuthentication.java - Singleton to manage user authentication
public class UserAuthentication {

    private static UserAuthentication instance;
    private String loggedInUser;

    // Private constructor to prevent instantiation
    private UserAuthentication() {}

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login(String username) {
        if (loggedInUser == null) {
            loggedInUser = username;
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println("User " + loggedInUser + " is already logged in.");
        }
    }

    public void logout() {
        System.out.println(loggedInUser + " logged out.");
        loggedInUser = null;
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }
}
