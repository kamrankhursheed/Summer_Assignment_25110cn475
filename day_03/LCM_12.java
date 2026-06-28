package day_03;

import java.util.Scanner;

public class LCM_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = a > b ? a : b;

        for (int i = n; i <= (a * b); i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM is: " + i);
                break;
            }
        }
        sc.close();
    }
}
