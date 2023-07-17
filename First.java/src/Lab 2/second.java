import java.util.Scanner;

public class second {
    public static void p1(int l, int m, int n, int o) {
        System.out
                .println("The value of the first expression is ="
                        + ((l * n * n * o) + (m * o * o * n) + (l * m) - (n * o)));
    }

    public static void p2(int c, int d, int e, int f) {
        System.out.println("The value of the second expression is:- " + ((c * d) + (3.14 * e * e) - (3.14 * f)));
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of a and b:- ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Enter the values of x and y:- ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        p1(a, b, x, y);
        p2(a, b, x, y);
        // Here in the function for power we cn also use Math.pow.
        scan.close();
    }
}
