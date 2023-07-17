package Lab4;

import java.util.Scanner;

public class sixth {
    public static void amstrong(int x) {
        int temp = x;
        int sum = 0;
        while (x != 0) {
            int rem = x % 10;
            sum += Math.pow(rem, 3);
            x = x / 10;
        }
        if (sum == temp) {
            System.out.println("The number is an amstrong number.");
        } else {
            System.out.println("The number is not an amstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:- ");
        n = scan.nextInt();
        amstrong(n);
        scan.close();
    }
}
