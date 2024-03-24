import java.util.Scanner;
class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }

    public static void main(String[] args) {
        int x,y;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the Real and imaginary parts of the first complex number");
            x=s.nextInt();
            y=s.nextInt();
            Complex c1 = new Complex(x,y);
            System.out.println("Enter the Real and imaginary parts of the second complex number");
            x=s.nextInt();
            y=s.nextInt();
            Complex c2 = new Complex(x,y);
            Complex c3 = c1.sum(c2);

            System.out.println("Complex Number 1: " + c1);
            System.out.println("Complex Number 2: " + c2);
            System.out.println("Sum of Complex Numbers: " + c3);
        }
    }
}