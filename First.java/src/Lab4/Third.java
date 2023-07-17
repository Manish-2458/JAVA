package Lab4;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter third number: ");
        int num3 = in.nextInt();

        // Sum of first and second number
        int sum12 = num1 + num2;

        // Product of first and second number
        int product12 = num1 * num2;

        // Average of first and second number
        double average12 = (double) (num1 + num2) / 2;

        // Minimum of first and second number
        int min12 = Math.min(num1, num2);

        // Maximum of first and second number
        int max12 = Math.max(num1, num2);

        // Sum of first and third number
        int sum13 = num1 + num3;

        // Product of first and third number
        int product13 = num1 * num3;

        // Average of first and third number
        double average13 = (double) (num1 + num3) / 2;

        // Minimum of first and third number
        int min13 = Math.min(num1, num3);

        // Maximum of first and third number
        int max13 = Math.max(num1, num3);

        // Sum of all three numbers
        int sum123 = sum12 + sum13;

        // Product of all three numbers
        int product123 = product12 * product13;

        // Average of all three numbers
        double average123 = (double) (sum123) / 3;

        // Print the results
        System.out.println("Sum of first and second number: " + sum12);
        System.out.println("Product of first and second number: " + product12);
        System.out.println("Average of first and second number: " + average12);
        System.out.println("Minimum of first and second number: " + min12);
        System.out.println("Maximum of first and second number: " + max12);
        System.out.println("Sum of first and third number: " + sum13);
        System.out.println("Product of first and third number: " + product13);
        System.out.println("Average of first and third number: " + average13);
        System.out.println("Minimum of first and third number: " + min13);
        System.out.println("Maximum of first and third number: " + max13);
        System.out.println("Sum of all three numbers: " + sum123);
        System.out.println("Product of all three numbers: " + product123);
        System.out.println("Average of all three numbers: " + average123);
        in.close();
    }

    // Method Overloading

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return sum(num1, num2) + num3;
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static int product(int num1, int num2, int num3) {
        return product(num1, num2) * num3;
    }

    public static double average(int num1, int num2) {
        return (double) (num1 + num2) / 2;
    }

    public static double average(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }
}
