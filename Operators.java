public class Operators {
    public static void main(String[] args) {
        double pi = 3.1416;
        double radius = 5;
        double celsius = 30;

        double getCircumference = 2 * pi * radius;
        double getArea = pi * radius * radius;

        double getFahrenheit = celsius * 1.8 + 32;
        double getKelvin = celsius + 273.15;

        System.out.println("Circumference: " + getCircumference);
        System.out.println("Area: " + getArea);
        System.out.println("Fahrenheit: " + getFahrenheit);
        System.out.println("Kelvin: " + getKelvin);
    }
}
