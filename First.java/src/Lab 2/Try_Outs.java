import java.util.Scanner;

public class Try_Outs {
    public static void main(String[] args) {
        // Question 1
        // int d = 4;
        // float f = 9.5f;//The error here is 'f' is not mentioned after the floating
        // point number.
        // System.out.println(d * f);
        // Question 2
        /*
         * System.out.println(0.5 % 1);
         * System.out.println(3.5 % 3.4);
         * System.out.println(5.2 % 2);
         * System.out.println(9 % 2);
         * Thier is no error in the above code.
         */
        // Question3
        // int v = 0;
        // System.out.println(v++);
        // System.out.println(++v);
        // Output is 0 and 2
        // SO first here the value of v is declared as zero and in the first case the
        // value of v is getting post incremented and the value of v will be 1, but it
        // will display 0 as it is post inc, and in the 2nd case it is pre inc so now it
        // will increment the value of v and print it(pre inc) and hence the value of v
        // is 2.
        // Question 4.
        // int x1, x2;
        // System.out.println(x1 + x2);
        // Here in this case the variables x1 and x2 are uninitialized. hence this is an
        // error in this code.
        // Question 5
        Scanner sc = new Scanner(System.in);
        double w, y;
        int a, b, c;
        System.out.println("Enter values of variables: ");
        System.out.print("w: ");
        w = sc.nextDouble();
        System.out.print("y: ");
        y = sc.nextDouble();
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();
        System.out.println();
        System.out.println("Printing expressions & results.... \n");
        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a - b - c = " + (a - b - c));
        System.out.println("-a > b = " + (-a > b));
        System.out.println(" b < a or y > w = " + (b < a || y > w));
        System.out.println("a<b and c not equal to a = " + (a < b && c != a));
        System.out.println("25 > = a - b / c = " + (25 >= a - b / c));
        System.out.println("a - b / c = " + (a - b / c));
        System.out.println("a * b /c = " + (a * b / c));
        System.out.println("w / y = " + (w / y));
        System.out.println("y / w = " + (y / w));
        System.out.println("a + w / b = " + (a + w / b));
        System.out.println("a % b / y = " + (a % b / y));
        System.out.println("b % a = " + (b % a));
        System.out
                .println("((a^2 + 3b)*7)/(2(ab)^2) = " + (((Math.pow(a, 2) + 3 * b) * 7) / (2 * Math.pow((a * b), 2))));
        sc.close();
    }
}
