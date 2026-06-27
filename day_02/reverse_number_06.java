
package day_02;

// Date: 27 June 2025
// File: reverse_number
// Topic: Reverse a Number

import java.util.Scanner;

public class reverse_number_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int rev_num = 0;
        while (n != 0) {
            rev_num = rev_num * 10 + (n % 10);
            n /= 10;
        }

        System.out.println(rev_num);
        sc.close();
    }
}

