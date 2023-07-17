import java.util.Scanner;
import java.util.Random;

public class guess_number {

    public static void guess(int x, int y) {
        Scanner sc = new Scanner(System.in);
        if (x == y) {
            System.out.println("You have guesses the number.");
            // count++;
        }
        if (x > y) {
            // count++;
            System.out.println("You have enterd a numebr greater than the random number.");
            System.out.println("Enter another number.");
            int n1 = sc.nextInt();
            guess(n1, y);
        }
        if (x < y) {
            // count++;
            System.out.println("You have enterd a numebr less than the random number.");
            System.out.println("Enter another number.");
            int n2 = sc.nextInt();
            guess(n2, y);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100:- ");
        int n = scan.nextInt();
        Random rand = new Random();
        int m = rand.nextInt(1, 101);
        guess(n, m);
        scan.close();
    }
}
