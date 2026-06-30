package day_26;

import java.util.Scanner;

public class Q_103 {
    public static void main(String[] args) {
        int pin = 1234, p, balance = 5000, amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        p = sc.nextInt();
        if (p == pin) {
            System.out.print("Enter Amount: ");
            amount = sc.nextInt();
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Amount Withdrawn");
                System.out.println("Balance = " + balance);
            } else
                System.out.println("Insufficient Balance");
        } else
            System.out.println("Wrong PIN");
    }
}
