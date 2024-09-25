import java.util.Scanner;

public class EmployeementPayrollManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Type: \n 1. Permanent\n 2. Temporary");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                System.out.println("PERMANENT EMPLOYEE");
                System.out.println("Enter Employee ID: ");
                int permanentID = sc.nextInt();
                System.out.println("Enter Employee Name: ");
                String permanentEmployeeName = sc.next();
                System.out.println("Enter Basic Salary: ");
                float permanentBasicSalary = sc.nextFloat();
                System.out.println("Enter PF: ");
                float permanentPF = sc.nextFloat();
                PermanentEmployee PE = new PermanentEmployee(permanentID, permanentEmployeeName, permanentBasicSalary, permanentPF);
                System.out.println("The Details are: ");
                PE.display();
                break;
            case 2:
                System.out.println("TEMPORARY EMPLOYEE");
                System.out.println("Enter Employee ID: ");
                int temporaryID = sc.nextInt();
                System.out.println("Enter Employee Name: ");
                String temporaryEmployeeName = sc.next();
                System.out.println("Enter Daily Wages: ");
                float temporaryDailyWages = sc.nextFloat();
                System.out.println("Enter No of Days Worked: ");
                int nofOfDaysWorked = sc.nextInt();
                TemporaryEmployee TE = new TemporaryEmployee(temporaryID, temporaryEmployeeName, temporaryDailyWages, nofOfDaysWorked);
                System.out.println("The Details are: ");
                TE.display();
                break;
                default:
                    System.out.println("Invalid Employee Type");
        }
        sc.close();
    }
}
