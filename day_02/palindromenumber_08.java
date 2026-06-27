package day_02;


import java.util.Scanner;

public class palindromenumber_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        int num = n; // storing original number for later comparison
        int rev_num = 0;
        while (n != 0) {
            rev_num = rev_num * 10 + (n % 10);
            n /= 10;
        }

        if (rev_num == num)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
