package Lab1;

import java.util.Scanner;

public class Eighth {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum1(double x1, double y1) {
        return x1 + y1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n1 = scan.nextInt();
        System.out.println("Enter another number:- ");
        int n2 = scan.nextInt();
        System.out.println("The sum of the two numbers is:- " + sum(n1, n2));
        System.out.println("Enter two numbers of double type:- ");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        System.out.println("The sum of the two numbers is:- " + sum1(d1, d2));
    }
}
