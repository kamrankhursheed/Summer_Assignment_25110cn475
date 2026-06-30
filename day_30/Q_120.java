package day_30;

import java.util.Scanner;

public class Q_120 {
    static void display(String name, int marks) {
        System.out.println("\nName: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        String name;
        int marks;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        display(name, marks);
    }
}
