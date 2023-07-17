import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message:-");
        String msg = scan.nextLine();
        System.out.println("The message entered is " + msg);
        scan.close();
    }
}
