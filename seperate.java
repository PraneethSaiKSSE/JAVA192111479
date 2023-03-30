import java.util.*;

public class seperate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        
        String vowels = "";
        String consonants = "";

        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
            
                vowels += c;
            } else {
                
                consonants += c;
            }
        }

        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
