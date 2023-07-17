package Turorial;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of days:- ");
        int d = scan.nextInt();
        float y, m, w;
        y = (float) d / 365;
        m = (float) d / 30;
        w = (float) d / 7;
        System.out.printf("For the number of days the req is as follows:-\n year:- %f \n Months:- %f\n Weeks:- %f.", y,
                m, w);
        scan.close();
    }
}
