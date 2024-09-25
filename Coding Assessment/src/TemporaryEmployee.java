public class TemporaryEmployee extends Employee {
    float dailyWages;
    int noOfDays;

    public TemporaryEmployee(int id,String name, float dailyWages, int noOfDays) {
        this.id = id;
        this.name = name;
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
        calculateSalary();
        calculateBonus();
    }

    private void calculateSalary() {
        this.netSalary = dailyWages * noOfDays;
    }

    private void calculateBonus() {
        if(dailyWages<1000)
            bonus = 0.15f * netSalary;
        else if(dailyWages>=1000 && dailyWages<1500)
            bonus = 0.12f * netSalary;
        else if(dailyWages>=1500 && dailyWages<1750)
            bonus = 0.11f * netSalary;
        else
            bonus = 0.08f * netSalary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No. of Days Worked: " + noOfDays);
    }
}
