import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
