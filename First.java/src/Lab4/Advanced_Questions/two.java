import java.util.Scanner;

public class two {
    public static int sum(int x) {
        if (x == 0) {
            return 0;
        }
        return x % 10 + sum(x / 10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numebr:- ");
        int n = scan.nextInt();
        System.out.println("The sum of the digits of the entered number is " + sum(n));
        scan.close();
    }
}
