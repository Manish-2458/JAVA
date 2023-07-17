import java.util.Scanner;;

public class Five {
    public static void main(String[] args) {
        // The below is 2nd bit solution.
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter a number:- ");
        // int n = scan.nextInt();
        // int sum = 0;
        // while (n != 0) {
        // sum += n % 10;
        // n = n / 10;
        // }
        // System.out.println("The sum of the digits in the number entered is:- " +
        // sum);
        // scan.close();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = scan.nextInt();
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        if (n == 1) {
            System.out.println("The number is neither prime nor composite.");
        }
        if (flag == 0) {
            System.out.println("The number is a prime number!");
        } else {
            System.out.println("The number is not a prime number.");
        }
    }
}
