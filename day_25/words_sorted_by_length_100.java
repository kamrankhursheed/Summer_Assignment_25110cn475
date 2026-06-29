package day_25;

import java.util.Scanner;

public class words_sorted_by_length_100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // bubble sort by word length
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("\nWords sorted by length:");
        for (int i = 0; i < n; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}