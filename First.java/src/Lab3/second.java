package Lab3;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double PE1, PE2, CE, END;
        System.out.println("Enter PE1 Marks: ");
        PE1 = in.nextDouble();
        System.out.println("Enter PE2 Marks : ");
        PE2 = in.nextDouble();
        System.out.println("Enter CE Marks : ");
        System.out.println("Enter CE Marks : ");
        CE = in.nextDouble();
        System.out.println("Enter END Marks : ");
        END = in.nextDouble();
        PE1 = PE1 / 10;
        PE2 = PE2 * 15 / 100;
        CE = CE * 35 / 100;
        END = END * 40 / 100;
        double final_score = PE1 + PE2 + CE + END;
        if (final_score >= 90)
            System.out.println("Grade O");
        else if (final_score >= 80)
            System.out.println("Grade A+");
        else if (final_score >= 70)
            System.out.println("Grade A");
        else if (final_score >= 60)
            System.out.println("Grade B+");
        else if (final_score >= 50)
            System.out.println("Grade B+");
        else if (final_score >= 45)
            System.out.println("Grade C");
        else
            System.out.println("Grade F");
        in.close();

    }
}
