import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a list of names, separated by commas: ");
        String input = scanner.nextLine();

        
        String[] names = input.split(",");

        
        List<String> nameList = new ArrayList<String>();
        for (String name : names) {
            
            name = name.trim();
            if (!name.isEmpty()) {
                nameList.add(name);
            }
        }

        
        System.out.print("Choose a sorting order (asc/desc): ");
        String order = scanner.nextLine();

        
        if (order.equalsIgnoreCase("asc")) {
            Collections.sort(nameList);
        } else if (order.equalsIgnoreCase("desc")) {
            Collections.sort(nameList, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sorting order. Please choose either 'asc' or 'desc'.");
            return;
        }

        
        System.out.println("Sorted names:");
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
