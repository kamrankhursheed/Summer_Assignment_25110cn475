package day_24;

import java.util.Scanner;

public class check_string_rotation_93 {

    static boolean is_rotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the strings a and b: ");
        String a = sc.next();
        String b = sc.next();

        if (is_rotation(a, b)) {
            System.out.println("Yes the string \"" + b + "\" is a rotation of string \"" + a + "\"");
        } else {
            System.out.println("no the given strings are not rotation of each other");
        }

        sc.close();
    }
}