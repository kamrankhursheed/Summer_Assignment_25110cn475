package day_28;

import java.util.Scanner;

public class Q_112 {
    public static void main(String[] args) {
        String name;
        long mobile;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Mobile Number: ");
        mobile = sc.nextLong();

        System.out.println("\nContact Saved");
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
    }
}
