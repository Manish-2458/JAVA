package Turorial;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ente a number:- ");
        int n = scan.nextInt();
        int flag = 0;
        while (n != 0) {
            int temp = n % 10;
            n = n / 10;
            if (temp % 2 != 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("He failed the game.");
        } else {
            System.out.println("He completed the game successfully");
        }
        scan.close();
    }
}
