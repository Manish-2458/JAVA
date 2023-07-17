package Turorial;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ec = 0;
        int oc = 0;
        System.out.println("ENter a number:- ");
        int n = scan.nextInt();
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                ec++;
                n /= 10;
            } else {
                oc++;
                n /= 10;
            }
        }
        System.out.println("The number of even digits in the number is;- " + ec);
        System.out.println("The number of odd digits in the number is:- " + oc);
        scan.close();
    }
}
