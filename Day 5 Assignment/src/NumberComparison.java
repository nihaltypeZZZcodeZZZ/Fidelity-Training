import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        int x = sc.nextInt();
        System.out.println("Enter the value for Y: ");
        int y = sc.nextInt();
        boolean result = x < y;
        System.out.println("The Result of whether x is less than y is " + result);
    }
}
