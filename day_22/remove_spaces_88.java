package day_22;

public class remove_spaces_88 {

    public static void main(String[] args) {

        String str = "I am the GOD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
