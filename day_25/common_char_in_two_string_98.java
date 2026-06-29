package day_25;

import java.util.Scanner;

public class common_char_in_two_string_98 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        System.out.print("Common characters: ");
        for (int i = 0; i < s1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print(s1.charAt(i) + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}
