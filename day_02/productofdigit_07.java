package day_02;

import java.util.Scanner;

public class productofdigit_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.print("Product = 0");
            sc.close();
            return;
        }

        int product = 1;
        while (n != 0) {
            product *= n % 10;
            n /= 10;
        }

        System.out.print("product = " + product);
        sc.close();
    }
}