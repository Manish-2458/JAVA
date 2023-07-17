package Lab3;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an n-digit number:- ");
        int n = scan.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of the digits is  " + sum);
        scan.close();
    }
}
