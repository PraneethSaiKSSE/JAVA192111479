import java.util.*;

public class remove{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowels: " + result);
    }
}
