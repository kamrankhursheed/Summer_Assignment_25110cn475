package day_29;

import java.util.Scanner;

public class Q_114 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 5; i++)
            sum = sum + a[i];

        System.out.println("Sum = " + sum);
    }
}
