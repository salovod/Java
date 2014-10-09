import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner palindrome = new Scanner(System.in);
        System.out.println("Input word: ");
        String word = palindrome.nextLine().toLowerCase();
        if (word.length() == 5) {
            if (word.charAt(0) == word.charAt(4) & word.charAt(1) == word.charAt(3)) {
                System.out.println("Polindrom");
            } else
                System.out.println("Not Polindrom");
        } else System.out.println("Error. Should be 5 letters");
    }
}
