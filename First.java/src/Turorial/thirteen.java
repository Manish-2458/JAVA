package Turorial;

import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = scan.nextInt();
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (rev == temp) {
            System.out.println("The number entered is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        scan.close();
    }
}
