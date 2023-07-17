package Lab5;

import java.util.Scanner;

class Rectangle {
    int length = 10, breadth = 15, area, perimeter;

    public int getArea() {
        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayDetails() {
        System.out.println("Length= " + length);
        System.out.println("Breadth= " + breadth);
    }
}

public class fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of objects to be created:- ");
        int n = scan.nextInt();
        Rectangle[] rectangles = new Rectangle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the length of the rectangle:- ");
            int length = scan.nextInt();
            System.out.println("Enter the breadth of the rectangle:- ");
            int breadth = scan.nextInt();
            rectangles[i] = new Rectangle(length, breadth);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Rectangle " + (i + 1));
            rectangles[i].displayDetails();
        }
        scan.close();
    }
}
