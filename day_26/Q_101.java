package day_26;

import java.util.Scanner;

public class Q_101 {
    public static void main(String[] args) {
        int num = 7, guess;
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number (1-10): ");
        guess = sc.nextInt();
        if (guess == num)
            System.out.println("Correct Guess!");
        else
            System.out.println("Wrong Guess");
    }
}
