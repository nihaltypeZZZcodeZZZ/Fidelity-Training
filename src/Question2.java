import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pizza Count");
        int Pizza = sc.nextInt();
        System.out.println("Enter Puffs Count");
        int puff = sc.nextInt();
        System.out.println("Enter Pepsi Count");
        int pepsi = sc.nextInt();

        int total = 200*Pizza + 40*puff + 120*pepsi;
        System.out.println("Total Bill is " + total);
    }
}
