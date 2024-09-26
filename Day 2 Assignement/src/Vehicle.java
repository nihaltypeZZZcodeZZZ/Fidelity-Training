public class Vehicle {
    protected String registrationNumber;
    protected String brand;
    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }
    public double calculateParkingFee(){
        return 0.0;
    }
}
