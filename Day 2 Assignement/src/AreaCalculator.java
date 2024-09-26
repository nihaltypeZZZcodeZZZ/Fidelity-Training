public class AreaCalculator {
    public double calculateArea(double side){
        return side * side;
    }
    public double calculateArea(double length, double width){
        return length * width;
    }
    public double calculateArea(float radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        double squareArea  = calc.calculateArea(5.0);
        System.out.println("Area of square is: " + squareArea);
        double rectangleArea = calc.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle is: " + rectangleArea);
        double circleArea = calc.calculateArea(3.0f);
        System.out.println("Area of circle is: " + circleArea);
    }
}
