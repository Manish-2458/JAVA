package Lab6;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the number of objects:- ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter 0 for red, 1 for white and 2 for blue.");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted features is:- ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        scan.close();
    }
}
