import java.util.*;

public class character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        
        System.out.print("Enter a character: ");
        char ch = scanner.nextLine().charAt(0);

        
        boolean found = false;

        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                
                System.out.println("Character '" + ch + "' found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            
            System.out.println("Character '" + ch + "' not found in the string");
        }
    }
}
