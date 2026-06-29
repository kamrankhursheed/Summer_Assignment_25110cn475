package day_23;

import java.util.Scanner;

public class max_occuring_char_92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the string: ");
        String s1 = sc.next();

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        int max_freq = 0;
        char max_freq_element = 0;

        for (int i = 0; i < 256; i++) {
            if (max_freq < freq[i]) {
                max_freq = freq[i];
                max_freq_element = (char) i;
            }
        }

        System.out.println("the maximum occuring element is " + max_freq_element + "(" + max_freq + " times)");

        sc.close();
    }
}
