package Lab6.Advanced;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:- ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] b = new int[m][n];
        System.out.println("Enter the values of the matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += b[i][j];
                }
            }
        }
        System.out.println("The sum of the principle diagonal elements of the 2-D array is:- " + sum);
        scan.close();
    }
}
