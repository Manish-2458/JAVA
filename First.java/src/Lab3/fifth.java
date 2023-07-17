package Lab3;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * //a
         * 
         * System.out.println("Enter the value of N:- ");
         * int n = scan.nextInt();
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.printf("%d", i);
         * }
         * System.out.printf("\n");
         * }
         * 
         */
        // b
        System.out.println("Enter the value for the number of rows to be printed:- ");
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        scan.close();
    }
}
