import java.util.Scanner;

public class special{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();


        int count = 0;

        
        System.out.print("Special characters: ");
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                System.out.print(c + " ");
                count++;
            }
        }
        System.out.println();

        
        System.out.println("Total number of special characters: " + count);
    }
}
