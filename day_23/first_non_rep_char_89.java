package day_23;

public class first_non_rep_char_89 {

    public static void main(String[] args) {

        String str = "ajhdsjbdjsdffiruha";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] == 1) {
                System.out.println("the first non repeating character is " + (char) i);
                break;
            }
        }
    }
}
