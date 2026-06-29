package day_22;

import java.util.Scanner;

public class count_words_86 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the sentence: ");
        String str = sc.nextLine(); // for getting the input with spaces in between words

        int word_count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                word_count++;
            }
        }

        System.out.println("total number of words = " + word_count);

        sc.close();
    }
}
