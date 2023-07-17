package Turorial;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum marks:- ");
        float m = scan.nextInt();
        System.out.println("Enter the marks secured:- ");
        float s = scan.nextInt();
        float p = (s / m) * 100;
        if (p <= 35) {
            System.out.println("F");
        } else if (36 <= p && p <= 45) {
            System.out.println("E");
        } else if (46 <= p && p <= 55) {
            System.out.println("D");
        } else if (56 <= p && p <= 65) {
            System.out.println("C");
        } else if (66 <= p && p <= 75) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        scan.close();
    }
}
