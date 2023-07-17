import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Remember to enter the quantity in kg's!");
        System.out.println("Enter the quantity of carrots.:- ");
        int c = scan.nextInt();
        System.out.println("ENter the quantity of Oranges:- ");
        int o = scan.nextInt();
        System.out.println("ENter the quantity of Apples;- ");
        int a = scan.nextInt();
        System.out.println("Enter the quantity of Cabbage:- ");
        int cab = scan.nextInt();
        System.out.println("ENter the quantity of bananas:- ");
        int b = scan.nextInt();
        System.out.println("Bill");
        System.out.println("Carrots= " + 50 * c + "Rs.");
        System.out.println("Carrots= " + 10 * o + "Rs.");
        System.out.println("Carrots= " + 25 * a + "Rs.");
        System.out.println("Carrots= " + 20 * cab + "Rs.");
        System.out.println("Carrots= " + 30 * b + "Rs.");
        System.out.println("The total bill is= " + (50 * c + 10 * o + 25 * a + 20 * cab + 30 * b) + "Rs.");
        scan.close();
    }
}
