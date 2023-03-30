import java.util.*;

public class valid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean isValid = isValidUsername(username);
        if (isValid) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is invalid.");
        }
    }

    public static boolean isValidUsername(String username) {
        
        String regex = "^[a-zA-Z0-9_]{5,20}$";

        
        boolean matches = username.matches(regex);

        return matches;
    }
}
