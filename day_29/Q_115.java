package day_29;

import java.util.Scanner;

public class Q_115 {
    public static void main(String[] args) {
        String s;
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Length\n2.Display");
        ch = sc.nextInt();
        System.out.print("Enter String: ");
        s = sc.next();

        if (ch == 1)
            System.out.println("Length = " + s.length());
        else if (ch == 2)
            System.out.println(s);
        else
            System.out.println("Invalid Choice");
    }
}
