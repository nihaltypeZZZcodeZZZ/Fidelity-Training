import java.util.Scanner;

public class ReverseSentence {
    private static String reverseSentence(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        return reversedString.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputString = sc.nextLine();
        String reversedString = reverseSentence(inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}
