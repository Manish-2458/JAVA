package Lab4;

import java.util.Scanner;

public class first {
    public static void bill(String name, int b, int d, int r) {
        System.out.println("Customer Name: " + name);
        System.out.println("Item\tRate\tNumber\tCost");
        System.out.println("Bottle\t35.50\t" + b + "\t" + 35.50 * b);
        System.out.println("Diaper\t9.95\t" + d + "\t" + 9.95 * d);
        System.out.println("Rattle\t7.00\t" + r + "\t" + 7.00 * r);
        System.out.println("-----------------------------------");
        System.out.println("Total\t\t\t" + (35.50 * b + 9.95 * d + 7.00 * r));
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the customer:- ");
        String name = scan.nextLine();
        System.out.println("Enter the quantites of each item respectively(Bottles,Diapers,Rattles):- ");
        int b = scan.nextInt();
        int d = scan.nextInt();
        int r = scan.nextInt();
        bill(name, b, d, r);
        scan.close();
    }
}
