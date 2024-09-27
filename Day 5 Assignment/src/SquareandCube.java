import java.util.Scanner;

public class SquareandCube {
    public static double findSquare(double number){
        return number * number;
    }
    public static double findCube(double number){
        return number * number * number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        double square = findSquare(number);
        double cube = findCube(number);
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The cube of " + number + " is: " + cube);
    }
}
