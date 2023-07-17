package Lab3.Advanced_questions;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n1 = scan.nextInt();
        System.out.println("Start entering the numbers:- ");
        int sum = 0;
        int[] a = new int[100];
        for (int i = 0;; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
            if (sum > n1) {
                System.out.println("DONE");
                break;
            }
        }
        scan.close();
    }
}
