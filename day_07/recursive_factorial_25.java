package day_07;

import java.util.Scanner;

public class recursive_factorial_25 {

    static int factorial(int x) {
        if (Math.abs(x) < 2)
            return 1;
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be calculated: ");
        int n = sc.nextInt();

        int fact = factorial(n);
        System.out.println(fact);

        sc.close();
    }
}
    
