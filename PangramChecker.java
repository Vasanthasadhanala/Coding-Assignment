import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {
        
        input = input.toLowerCase();


        Set<Character> uniqueLetters = new HashSet<>();

        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        
        for (char c = 'a'; c <= 'z'; c++) {
            if (!uniqueLetters.contains(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence or phrase: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
