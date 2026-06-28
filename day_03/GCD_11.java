package day_03;

import java.util.Scanner;

public class GCD_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = a > b ? b : a;

        for (int i = n; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD of " + a + " & " + b + " is " + i);
                break;
            }
        }
        sc.close();
    }
}
