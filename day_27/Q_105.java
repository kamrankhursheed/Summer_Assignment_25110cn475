package day_27;

import java.util.Scanner;

public class Q_105 {
    public static void main(String[] args) {
        int roll;
        String name;
        float marks;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();

        System.out.println("\nStudent Record");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
