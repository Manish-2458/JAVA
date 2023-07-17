import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 digit number:- ");
        int n = scan.nextInt();// 123
        int x = n % 10;// 3
        n = n / 10;// n=12
        int y = n % 10;
        int z = n / 10;
        int sum = x + y + z;
        System.out.println(sum);
        scan.close();
    }
}
