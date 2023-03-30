import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        try {
            int num = Integer.parseInt(str);
            System.out.println("Integer value: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
}