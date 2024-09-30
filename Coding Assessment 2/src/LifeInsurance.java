public class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }
    @Override
    public double calculatePremium(){
        double amountCovered= getAmountCovered() - ((getAmountCovered()*benefitPercent)/100);
        return amountCovered/policyTerm;
    }
}
