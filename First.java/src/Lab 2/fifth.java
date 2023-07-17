import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int greaterNum = Math.max(num1, num2);

        System.out.println(greaterNum == num1 ? "greater" : "not greater");

        scanner.close();
    }
}