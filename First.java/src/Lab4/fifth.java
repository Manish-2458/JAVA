package Lab4;

import java.util.Scanner;

public class fifth {
    public static void prime(int x) {
        System.out.println("The prime members are as follows:- ");
        for (int i = 2; i <= x; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = scan.nextInt();
        prime(n);
        scan.close();
    }
}
