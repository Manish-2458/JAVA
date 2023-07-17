package Lab4;

import java.util.Scanner;

public class seventh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = in.nextInt();

        System.out.print("Enter the end number: ");
        int end = in.nextInt();

        System.out.println("The Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
        in.close();
    }

    public static boolean isArmstrongNumber(int n) {
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == n;
    }
}