import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {

    static Logger logger = Logger.getLogger("LoginLogger");

    public static void main(String[] args) {
        String username = "user123";
        boolean loginSuccessful = true;

        // Non-compliant code
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }

        // Compliant code
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        if (Pattern.matches("[A-Za-z0-9]+", username)) {
            return username;
        }
        return "unauthorized user";
    }
}
