public class RectanglePoint {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(3, 6);

        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        if (rectangle1.getArea() == rectangle2.getArea()) {
            System.out.println("The two rectangles have the same area.");
        } else {
            System.out.println("The two rectangles have different areas.");
        }
    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}