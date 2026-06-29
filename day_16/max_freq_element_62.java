package day_16;

public class max_freq_element_62 {
    public static void main(String[] args) {
        int[] array = {34, 56, 74, 3, 34, 56, 56}; // integers between 0-100
        int[] freq = new int[101]; // size is dependent on the range of integers inside the array

        for (int x : array) {
            freq[x]++;
        }

        int max_freq = 0;
        int max_freq_element = 0;

        for (int i = 0; i < 101; i++) {
            if (max_freq < freq[i]) {
                max_freq = freq[i];
                max_freq_element = i;
            }
        }

        System.out.println("the element having maximum frequency of " + max_freq + " is " + max_freq_element);
    }
}
