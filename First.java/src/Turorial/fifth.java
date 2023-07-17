package Turorial;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of classes:- ");
        int t = scan.nextInt();
        System.out.println("Enter the number of classes attended:- ");
        int a = scan.nextInt();
        if ((float) a / t >= 0.75) {
            System.out.println("He is allowed to write the exam.");
        } else {
            System.out.println("He can't appear for the exam.");
        }
        scan.close();
    }
}
