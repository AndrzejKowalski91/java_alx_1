import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of three sides of a triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            double area = calculateTriangleArea(a, b, c);
            System.out.println("These sides can form a triangle.");
            System.out.println("Area of the triangle: " + area);
        } else {
            System.out.println("These sides cannot form a triangle.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}