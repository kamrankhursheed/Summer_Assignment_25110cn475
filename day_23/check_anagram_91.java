package day_23;

import java.util.Scanner;

public class check_anagram_91 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter two strings: ");
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("not anagrams");
            sc.close();
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println("the given strings are not anagrams");
                sc.close();
                return;
            }
        }

        System.out.println("the given strings are anagrams");
        sc.close();
    }
}
