package Lab4;

import java.util.Scanner;

public class second {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int product(int x, int y) {
        return x * y;
    }

    public static float average(int x, int y) {
        return (x + y) / 2.0f;
    }

    public static int minimum(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int maximum(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:- ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("The sum of the two numbers is " + sum(n1, n2));
        System.out.println("The product of the two numbers is " + product(n1, n2));
        System.out.println("The average of the two numbers is " + average(n1, n2));
        System.out.println("The minimum of the two numbers is " + minimum(n1, n2));
        System.out.println("The maximum of the two numbers is " + maximum(n1, n2));
        scan.close();
    }
}
