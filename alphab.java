import java.util.*;

public class alphab{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        
        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        
        String reversed = new String(chars);
        System.out.println("Word arranged in alphabetical order in reverse: " + reversed);
    }
}
