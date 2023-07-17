import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current year.");
        int c = scan.nextInt();
        System.out.println("ENter your birth year.");
        int b = scan.nextInt();
        System.out.println("You have revolved around the sun for " + (c - b));
        System.out.println("You have revolved around the sun for " + 12 * (c - b));
        System.out.println("You have revolved around the sun for " + 365 * (c - b));
        scan.close();
    }
}
