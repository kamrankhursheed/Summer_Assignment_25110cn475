package day_21;

public class reverse_string_82 {

    public static void main(String[] args) {

        String s = "ShowYourDiscipline";
        String rev_s = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev_s += s.charAt(i);
        }

        s = rev_s; // modified the original string

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println();
    }
}
