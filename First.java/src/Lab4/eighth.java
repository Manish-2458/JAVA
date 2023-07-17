package Lab4;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numebr of terms of the fiboonaci series:- ");
        int n = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        scan.close();
    }
}
