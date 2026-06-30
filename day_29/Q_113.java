package day_29;

import java.util.Scanner;

public class Q_113 {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        ch = sc.nextInt();
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (ch == 1)
            System.out.println("Answer = " + (a + b));
        else if (ch == 2)
            System.out.println("Answer = " + (a - b));
        else if (ch == 3)
            System.out.println("Answer = " + (a * b));
        else if (ch == 4)
            System.out.println("Answer = " + (a / b));
        else
            System.out.println("Invalid Choice");
    }
}
