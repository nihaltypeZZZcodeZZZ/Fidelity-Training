public class Car extends Vehicle {
    private int numDoors;
    public Car(String registrationNumber, String brand,int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }
    @Override
    public double calculateParkingFee(){
        return 10.0;
    }
    public void displayCarDetails() {
        System.out.println("Car Registration Number: "+ registrationNumber);
        System.out.println("Car Brand: "+ brand);
        System.out.println("Number of Doors: "+ numDoors);
        System.out.println("Parking Fee: "+ calculateParkingFee());
    }
}
