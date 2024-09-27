import java.util.Scanner;

public class Account {
    public int id;
    public String accountType;
    public double balance;
    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }
    public Account(){

    }
    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public String getDetails(){
        return "Account ID: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}
class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account ID: ");
        int id = sc.nextInt();
        System.out.println("Enter account type: ");
        String accountType = sc.next();
        System.out.println("Enter account balance: ");
        double balance = sc.nextDouble();
        Account account = new Account(id, accountType, balance);
        System.out.println("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        System.out.println(account.getDetails());
        if(account.withdraw(amount)) {
            System.out.println("New Balance: " + account.getBalance());
        }
        else {
            System.out.println("Insufficient Balance.");
        }
    }
}
