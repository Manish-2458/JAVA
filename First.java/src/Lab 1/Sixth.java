import java.util.Scanner;;

public class Sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:- ");
        int n = scan.nextInt();
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        while (rev != 0) {
            System.out.println(rev % 10);
            rev /= 10;
        }
    }
}
