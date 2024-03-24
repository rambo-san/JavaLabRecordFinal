import java .util.Scanner;
class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and width of rectangle 1:");
        double length1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(length1, width1);

        System.out.println("Enter the length and width of rectangle 2:");
        double length2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        Rectangle rectangle2 = new Rectangle(length2, width2);

        System.out.println("\nRectangle 1:");
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        System.out.println("\nDo rectangle 1 and rectangle 2 have the same area?: " + rectangle1.sameArea(rectangle2));

        scanner.close();
    }

    // Calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Calculate area
    public double calculateArea() {
        return length * width;
    }

    // Check if two rectangles have the same area
    public int sameArea(Rectangle other) {
        if (this.calculateArea() == other.calculateArea()) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
