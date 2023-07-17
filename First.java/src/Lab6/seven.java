package Lab6;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:- ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        System.out.println("Enter the values of the first matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the values of the second matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("The resulting sum of the matrices of the matrices are:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + b[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}
