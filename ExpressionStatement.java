public class ExpressionStatement {
    public static void main(String[] args) {
        int limit = 100;
        int height = 15;
        int width = 40;
        int Perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + Perimeter);
        if (Perimeter > limit) {
            System.out.println("The Perimeter for height " +height+ " and width " +width+ " is greater than " + limit);
        }
    }
}
