package Lab3;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = scan.nextInt();
        int temp = n;
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("The number is an amstrong number.");
        } else {
            System.out.println("It is not an amstrong number.");
        }
        scan.close();
    }
}
