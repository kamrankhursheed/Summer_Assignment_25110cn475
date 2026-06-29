package day_21;

public class count_vowels_consonants_83 {

    public static void main(String[] args) {

        String s = "quickbrownfoxjumpsoverthelazydog";

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }

        System.out.println("number of vowels are : " + vowel);
        System.out.println("number of consonants are : " + consonant);
    }
}
