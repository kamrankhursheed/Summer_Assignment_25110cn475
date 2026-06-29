package day_23;

public class first_rep_char_90 {

    public static void main(String[] args) {

        String str = "abcdefghiijkhgse";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println("the first repeating character is " + (char) i);
                break;
            }
        }
    }
}
