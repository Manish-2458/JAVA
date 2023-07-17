package Lab3.Advanced_questions;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:- ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int s = n - 1; s > i; s--) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        scan.close();
    }
}
