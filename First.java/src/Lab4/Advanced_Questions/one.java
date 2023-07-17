import java.util.Scanner;

public class one {
    public static void perfect_numbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }

            }
            if (sum == i) {
                System.out.println(i);
            }
            // if (sum != i) {
            // System.out.println(sum);
            // }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:- ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        perfect_numbers(n1, n2);
        scan.close();
    }
}
