package day_21;

public class lower_to_upper_case_84 {

    public static void main(String[] args) {

        String str = "iaminevitable";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += (char)(str.charAt(i) - 32);
        }

        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }

        System.out.println();
    }
}
