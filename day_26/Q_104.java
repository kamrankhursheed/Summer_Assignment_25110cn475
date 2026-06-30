package day_26;

import java.util.Scanner;

public class Q_104 {
    public static void main(String[] args) {
        int ans, score = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Capital of India?");
        System.out.println("1. Delhi\n2. Mumbai\n3. Agra");
        ans = sc.nextInt();
        if (ans == 1)
            score++;

        System.out.println("2. 5 + 3 = ?");
        System.out.println("1. 6\n2. 8\n3. 9");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        System.out.println("Your Score = " + score);
    }
}
