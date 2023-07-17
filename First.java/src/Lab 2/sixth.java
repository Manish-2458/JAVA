import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you marks out of 100 only.");
        System.out.println("ENter PE1 marks:- ");
        int pe1 = scan.nextInt();
        System.out.println("ENter your PE2 marks:- ");
        int pe2 = scan.nextInt();
        System.out.println("Enter your CE marks:- ");
        int ce = scan.nextInt();
        System.out.println("Enter you end sem marks:- ");
        int sem = scan.nextInt();
        System.out.println(
                "The final marks secured by the student is:- " + (0.1 * pe1 + 0.15 * pe2 + 0.35 * ce + 0.4 * sem));
        scan.close();
    }

}
