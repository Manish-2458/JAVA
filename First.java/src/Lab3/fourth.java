package Lab3;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2:- ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("Even numbers mentioned in the above range are:- ");
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
