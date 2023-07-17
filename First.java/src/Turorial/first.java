package Turorial;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of units by which the frog jumps:- ");
        int a = scan.nextInt();
        System.out.println("ENter the number of times the frog jumps:- ");
        int k = scan.nextInt();
        int pos = a * k;
        System.out.println("The position of the frog finally is :- " + pos);
        scan.close();
    }
}
