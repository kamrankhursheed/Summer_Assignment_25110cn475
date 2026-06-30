package day_26;

import java.util.Scanner;

public class Q_102 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        if (age >= 18)
            System.out.println("Eligible for Voting");
        else
            System.out.println("Not Eligible for Voting");
    }
}
