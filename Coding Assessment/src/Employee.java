public class Employee {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;

    public void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Net Salary: " + netSalary);
    }
}
