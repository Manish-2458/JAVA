package Lab4;

import java.util.Scanner;

public class fourth {
    public static void light_state(boolean t, boolean b) {
        // if (b == true && t == false) {
        // System.out.println("The lights over the staircase are turned");
        // } else if (b == false && t == true) {
        // System.out.println("The lights over the staircase are turned");
        // } else {
        // System.out.println("The lights over the staircase are NOT turned on");
        // }
        int v = 2;
        if (b ^ t == true) {
            v = 1;
        }
        switch (v) {
            case 1:
                System.out.println("The lights over the staircase are turned");
                break;
            case 2:
                System.out.println("The lights over the staircase are NOT turned");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the boolean values of top and bottom(true-ON and false-OFF):-");
        boolean top = scan.nextBoolean();
        boolean bottom = scan.nextBoolean();
        light_state(top, bottom);
        scan.close();
    }
}
