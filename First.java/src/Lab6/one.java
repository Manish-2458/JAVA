package Lab6;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:- ");
        int n = scan.nextInt();
        System.out.println("Enter the values of the array:- ");
        int[] a = new int[n];
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
        System.out.println("The second largets element of the array is:- " + a[n - 2]);
        scan.close();
    }
}
