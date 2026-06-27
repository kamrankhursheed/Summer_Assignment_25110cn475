package day_03;


import java.util.Scanner;

public class primenumber_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        boolean isprime = true; // using boolean flag so that i don't have to handle the edgecase n==2 separately
        if (n < 2) {
            isprime = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                isprime = false;
        }

        if (isprime)
            System.out.println("Yes , the given number is prime.");
        else
            System.out.println("No , the given number is not prime.");

        sc.close();
    }
}

