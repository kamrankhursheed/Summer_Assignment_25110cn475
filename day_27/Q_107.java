package day_27;

import java.util.Scanner;

public class Q_107 {
    public static void main(String[] args) {
        String name;
        int basic, bonus, total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextInt();
        System.out.print("Enter Bonus: ");
        bonus = sc.nextInt();

        total = basic + bonus;
        System.out.println("Total Salary = " + total);
    }
}
