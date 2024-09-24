import java.util.Scanner;

public class Question1 {
    public static int calcAvg(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The average is " + calcAvg(numbers));
    }
}
