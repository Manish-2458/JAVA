import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  your name:- ");
        String name = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name:- ");
        String Fullname = scan.nextLine();
        System.out.println("Enter your age:- ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter you address:- ");
        String address = scan.nextLine();
        System.out.println("Enter your height:- ");
        double height = scan.nextDouble();
        System.out.println("Enter your marks:- ");
        float marks = scan.nextFloat();
        System.out.println("Your name is " + name + ".\nYour Full name is " + Fullname + ".\nYour age is " + age
                + ".\nYour address is " + address + ".\nYour Height is " + height + ".\nYour marks are " + marks);
        scan.close();
    }
}
