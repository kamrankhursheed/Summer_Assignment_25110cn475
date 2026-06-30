package day_27;

import java.util.Scanner;

public class Q_106 {
    public static void main(String[] args) {
        int id;
        String name;
        int salary;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();

        System.out.println("\nEmployee Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
