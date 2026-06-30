package day_27;

import java.util.Scanner;

public class Q_108 {
    public static void main(String[] args) {
        String name;
        int m1, m2, m3, total;
        float per;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Marks of 3 Subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        per = total / 3.0f;

        System.out.println("\nTotal = " + total);
        System.out.println("Percentage = " + per);
    }
}
