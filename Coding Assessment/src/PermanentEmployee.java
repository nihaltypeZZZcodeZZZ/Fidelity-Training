public class PermanentEmployee extends Employee {
    float pf;
    public PermanentEmployee(int id, String name, float basicSalary, float pf) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.pf = pf;
        calculateSalary();
        calculateBonus();
    }
    private void calculateSalary() {
        this.netSalary = basicSalary - pf;
    }
    private void calculateBonus(){
        if(pf<1000)
            bonus = 0.10f * basicSalary;
        else if(pf>=1000 && pf<1500)
            bonus = 0.115f * basicSalary;
        else if(pf>=1500 && pf<1800)
            bonus = 0.12f * basicSalary;
        else
            bonus = 0.15f * basicSalary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Basic Sallary: "+ basicSalary);
        System.out.println("PF: "+pf);
    }

}
