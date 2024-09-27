import java.util.Scanner;

public class Calculator {
    public int Addition(int a, int b) {
        return a + b;
    }
    public int Subtraction(int a, int b) {
        return a - b;
    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    public double Division(int a, int b,double[] remainder) {
        double quotient = (double) a / b;
        remainder[0] = a % b;
        return quotient;
    }
}
class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the operands: ");
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        Calculator calculator = new Calculator();
        int result = 0;
        double[] remainder = new double[1];
        switch (operator) {
            case '+': result = calculator.Addition(operand1, operand2);
                System.out.println("The result of"+operand1+" + "+operand2+ " is: " + result);
            break;
            case '-': result = calculator.Subtraction(operand1, operand2);
                System.out.println("The result of"+operand1+" - "+ operand2+ " is: " + result);
            break;
            case '*': result = calculator.Multiplication(operand1, operand2);
                System.out.println("The result of"+operand1+" * "+operand2+ " is: " + result);
            break;
            case '/': double quotient = calculator.Division(operand1,operand2,remainder);
                System.out.println("The result of"+operand1+" / "+operand2+ " is: " + (int)quotient);
                System.out.println("The Remainder is: " + (int)remainder[0]);
                break;
                default:
                    System.out.println("Invalid operator");
        }
    }
}
