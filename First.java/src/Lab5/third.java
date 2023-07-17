package Lab5;

import java.util.Scanner;

class student {
    String name;
    int roll;
    float cgpa;
    String batch;

    public student(String name, int roll, float cgpa, String batch) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
        this.batch = batch;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Batch: " + batch);
    }
}

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of objects to be created:");
        int n = scan.nextInt();
        scan.nextLine();
        student[] students = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = scan.nextLine();
            System.out.println("Enter roll number:");
            int roll = scan.nextInt();
            System.out.println("Enter cgpa:");
            float cgpa = scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter batch:");
            String batch = scan.nextLine();
            students[i] = new student(name, roll, cgpa, batch);
        }

        System.out.println("Enter the roll number of the student:");
        int find = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (students[i].roll == find) {
                students[i].displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + find + " not found.");
        }

        scan.close();
    }
}
