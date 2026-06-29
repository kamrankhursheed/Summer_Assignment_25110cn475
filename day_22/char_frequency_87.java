package day_22;

public class char_frequency_87 {

    public static void main(String[] args) {

        String str = "adcdksjbhfbqwndjkcnds";
        char target = 'd';
        int freq = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                freq++;
            }
        }

        System.out.println("the frequency of the " + target + " is " + freq);
    }
}
