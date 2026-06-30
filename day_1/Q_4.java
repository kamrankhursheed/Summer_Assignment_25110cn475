package day_1;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        int n;
        int first = 0, second = 1, next;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
