import java.util.Scanner;

public class Question5 {
    public static void eligibility(int n){
        if(n<18){
            System.out.println("Not Eligible");
        }
        else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibility(age);
    }
}
