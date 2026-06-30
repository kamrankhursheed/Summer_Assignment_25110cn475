package day_28;

import java.util.Scanner;

public class Q_110 {
    public static void main(String[] args) {
        String name;
        int acc;
        float balance;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        acc = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextFloat();

        System.out.println("\nAccount Details");
        System.out.println("Account No: " + acc);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
