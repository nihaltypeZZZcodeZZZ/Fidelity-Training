import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] integerArray = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            integerArray[i] = sc.nextInt();
        }
        int sum = 0 ;
        for(int num: integerArray) {
            if(num%2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even number is "+ sum);
    }
}
