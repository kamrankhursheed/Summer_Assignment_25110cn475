package day_1;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        int n;
        long fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (int count = 1; count <= n; count++) {
            fact *= count;
        }

        System.out.println("Factorial = " + fact);
    }
}
