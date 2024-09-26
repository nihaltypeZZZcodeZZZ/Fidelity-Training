public class MotorCycle extends Vehicle {
    private String engineType;
    public MotorCycle(String registrationNumber, String Brand, String engineType) {
        super(registrationNumber, Brand);
        this.engineType = engineType;
    }
    @Override
    public double calculateParkingFee(){
        return 5.0;
    }
    public void displayMotorcycleDetails(){
        System.out.println("Mototcycle Registration Number: "+ registrationNumber);
        System.out.println("Motorcycle Brand: "+ brand);
        System.out.println("Engine Type: "+ engineType);
        System.out.println("Parking Fee: "+ calculateParkingFee());
    }
    public static void main(String[] args) {
        Car car = new Car("MF2096", "Maruti Suzuki", 4);
        System.out.println("Car Details: ");
        car.displayCarDetails();

        MotorCycle mc = new MotorCycle("AK4717", "Pulsar","V-Twin");
        System.out.println("Motorcycle Details: ");
        mc.displayMotorcycleDetails();
    }
}
