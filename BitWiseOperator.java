import java.util.Scanner;

class BitWiseOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two positive integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int andResult = num1 & num2;
        System.out.println("Bitwise AND: " + num1 + " & " + num2 + " = " + andResult+" Binary : "+Integer.toBinaryString(andResult));

        int orResult = num1 | num2;
        System.out.println("Bitwise OR: " + num1 + " | " + num2 + " = " + orResult+" Binary : "+Integer.toBinaryString(orResult));

        int xorResult = num1 ^ num2;
        System.out.println("Bitwise XOR: " + num1 + " ^ " + num2 + " = " + xorResult);

        int notResult1 = ~num1;
        System.out.println("Bitwise NOT: ~" + num1 + " = " + notResult1);

        int notResult2 = ~num2;
        System.out.println("Bitwise NOT: ~" + num2 + " = " + notResult2);

        int leftShiftResult = num1 << 2; // Shifting by 2 bits
        System.out.println("Left shift: " + num1 + " << 2 = " + leftShiftResult);

        int rightShiftResult = num2 >> 2; // Shifting by 2 bits
        System.out.println("Right shift: " + num2 + " >> 2 = " + rightShiftResult);

        scanner.close();
    }
}
