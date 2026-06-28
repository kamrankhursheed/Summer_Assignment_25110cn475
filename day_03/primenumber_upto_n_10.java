package day_03;

import java.util.Scanner;

public class primenumber_upto_n_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int j = 2; j < n; j++) {
            boolean isPrime = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(j + " ");
            }
        }
        sc.close();
    }
}
