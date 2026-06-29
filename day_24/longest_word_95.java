package day_24;

import java.util.Scanner;

public class longest_word_95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // assuming there are no leading spaces and special characters
        // (even if there is, it is used after a space) in the sentence,
        // and even if it is this code works but runtime increases
        System.out.print("enter the sentence: ");
        String s = sc.nextLine();

        String word = "";
        String longest_word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                if (word.length() > longest_word.length()) {
                    longest_word = word;
                }
                word = "";
            }
        }

        // check last word (no space after last word)
        if (word.length() > longest_word.length()) {
            longest_word = word;
        }

        System.out.println(longest_word);

        sc.close();
    }
}

