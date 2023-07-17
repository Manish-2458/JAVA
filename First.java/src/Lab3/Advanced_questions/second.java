package Lab3.Advanced_questions;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Start entering the numebrs:- ");
        int[] a = new int[100];
        int c = 0;
        for (int i = 0;; i++) {
            a[i] = scan.nextInt();
            c++;
            if (a[i] < 0) {
                break;
            }
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i <= c; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] > 0 && a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min= " + min + "\nMax= " + max);
        scan.close();
    }
}
