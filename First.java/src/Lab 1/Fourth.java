import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:- ");
        float fah = scan.nextFloat();
        float cel = ((float) 5 / 9) * (fah - 32);
        System.out.println("The corresponding temperature in celsius is:- " + cel);
    }
}
