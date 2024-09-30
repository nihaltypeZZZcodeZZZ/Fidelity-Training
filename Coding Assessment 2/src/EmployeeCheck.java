import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCheck {
    private ArrayList<Employee> employees = new ArrayList();
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    public void checkEmployeePresence(int id)throws EmployeeFoundException{
        for(Employee emp : employees) {
            if(emp.getId() == id) {
                System.out.println("Employee with ID "+id+" is present.");
                return;
            }
        }
        throw new EmployeeFoundException("Employee with ID "+id+" is not present.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeCheck ec = new EmployeeCheck();
        ec.addEmployee(new Employee(01,"Aakash"));
        ec.addEmployee(new Employee(02,"Aanand"));
        ec.addEmployee(new Employee(03,"Aaron"));
        ec.addEmployee(new Employee(04,"Rajesh"));
        ec.addEmployee(new Employee(05,"Austin"));
        ec.addEmployee(new Employee(06,"Virat"));
        ec.addEmployee(new Employee(07,"Rohith"));
        System.out.println("****Employee Attendance Management System****");
        boolean looping = true;
        while(looping) {
            System.out.println("Enter an option: \n1. To check if the employee is present \n2. Exit \n Enter your choic: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter an employee ID: ");
                    int id = sc.nextInt();
                    try{
                        ec.checkEmployeePresence(id);
                    }
                    catch(EmployeeFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case 2: looping = false;
                    break;
                    default:
                        System.out.println("Invalid option. Try again.");
            }
        }
    }
}
