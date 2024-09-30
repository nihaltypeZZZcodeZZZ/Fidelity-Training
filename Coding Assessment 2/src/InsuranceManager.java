import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsuranceManager {
    private List<Insurance> policies = new ArrayList<>();
    public double addPolicy(Insurance ins, int opt) {
        policies.add(ins);
        return ins.calculatePremium();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InsuranceManager manager = new InsuranceManager();
        System.out.println("Enter Insurance Number: ");
        String insuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Enter Amount Covered: ");
        double amount = sc.nextDouble();
        System.out.println("Select  \n1. Life Insurance \n2. Motor Insurance ");
        int option = sc.nextInt();
        if(option == 1){
            System.out.println("Policy Term: ");
            int policyTerm = sc.nextInt();
            System.out.println("Benefit Perrcentage: ");
            float benefitPercentage = sc.nextFloat();
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNo(insuranceNo);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountCovered(amount);
            lifeInsurance.setPolicyTerm(policyTerm);
            lifeInsurance.setBenefitPercent(benefitPercentage);
            double premium = manager.addPolicy(lifeInsurance, 1);
            System.out.println("Premium: "+premium );
        }
        else if(option == 2){
            System.out.println("Depreciation Percent: ");
            float depreciationPercentage = sc.nextFloat();
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNo);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amount);
            motorInsurance.setDepPercent(depreciationPercentage);
            double premium = manager.addPolicy(motorInsurance, 2);
            System.out.println("Premium: "+premium );
        }
        else {
            System.out.println("Invalid Option");
        }
    }
}
