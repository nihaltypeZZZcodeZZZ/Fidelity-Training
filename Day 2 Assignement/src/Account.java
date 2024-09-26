import java.util.Scanner;

public class Account {
    private int accNo;
    private String name;
    private double balance;
    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposit Successful. Amount deposited: $"+amount);
        }
        else {
            System.out.println("Invalid Deposit Amount.");
        }
    }
    public void withdraw(double amount) {
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdraw Successful. Amount withdrawn: $"+amount);
        }
        else if(amount>balance){
            System.out.println("Insufficient balance.");
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }
    public void checkBalance(){
        System.out.println("Account Balance: $"+balance);
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: "+accNo);
        System.out.println("Account Holder Name: "+name);
        System.out.println("Current Balance: "+balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(sc.nextInt(),sc.next(),sc.nextDouble());
        int choice;
        do{
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    acc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    acc.withdraw(withdrawAmount);
                    break;
                case 3:
                    acc.checkBalance();

                    break;
                case 4:
                    acc.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for Banking with us. Until next time");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice!=5);
    }
}
