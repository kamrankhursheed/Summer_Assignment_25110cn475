package day_21;

public class string_length_81 {

    public static void main(String[] args) {

        String s = "quickbrownfoxjumpsoverthelazydog";
        int length = 0;
        int i = 0;

        while (i < s.length()) {
            i++;
            length++;
        }

        System.out.println(length);
    }
}
