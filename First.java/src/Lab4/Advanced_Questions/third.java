import java.util.Scanner;

public class third {
    public static void sum_of_series(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += fact(i) / i;
        }
        System.out.println("The sum of the series is = " + sum);
    }

    public static int fact(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = scan.nextInt();
        sum_of_series(n);
        scan.close();
    }
}
