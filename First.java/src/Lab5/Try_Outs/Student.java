package Lab5.Try_Outs;

import java.util.Scanner;

public class Student {
    String name;
    int roll_no;
    float cgpa;
    String batch;

    String getName() {
        return name;
    }

    void updateCGPA(float newCgpa) {
        cgpa = newCgpa;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.cgpa);
        Student s2 = new Student();
        System.out.println(s2.name);
        scan.close();
    }
}
/*
 * Output
 * null
 * 0.0
 * null
 */
