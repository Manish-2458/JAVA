package Lab6;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:- ");
        int n = scan.nextInt();
        System.out.println("Enter the values of the array:- ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the value of the element to be searched:- ");
        int var = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == var) {
                System.out.println("The element is found at position " + (i + 1));
                break;
            }
        }
        scan.close();
    }
}
