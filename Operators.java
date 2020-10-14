public class Operators {
    public static void main(String[] args) {
        double Pi = 3.1416;
        double Radius = 5;
        double Celsius = 30;

        double getCircumference = 2 * Pi * Radius;
        double getArea = Pi * Radius * Radius;

        double getFahrenheit = Celsius * 1.8 + 32;
        double getKelvin = Celsius + 273.15;

        System.out.println("Circumference: " + getCircumference);
        System.out.println("Area: " + getArea);
        System.out.println("Fahrenheit: " + getFahrenheit);
        System.out.println("Kelvin: " + getKelvin);
    }
}
