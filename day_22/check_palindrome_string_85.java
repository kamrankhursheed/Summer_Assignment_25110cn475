package day_22;

import java.util.Scanner;

public class check_palindrome_string_85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the input string: ");
        String s = sc.next();

        int l = s.length();
        int i = 0;
        int j = l - 1;

        while (i <= l / 2 && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

        if (i > l / 2) {
            System.out.println("string is a palindrome");
        } else {
            System.out.println("string isn't a palindrome");
        }

        sc.close();
    }
}
