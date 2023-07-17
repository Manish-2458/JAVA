package Lab3;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        in.close();

    }
}
