package day_24;

public class string_compression_94 {

    static String compress_string(String s) {
        String new_str = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                new_str += s.charAt(i);
                new_str += count;
                count = 1;
            }
        }
        return new_str;
    }

    public static void main(String[] args) {

        String s = "aaabbbccddddee";
        String compressed = compress_string(s);

        System.out.println("original string   : " + s);
        System.out.println("compressed string : " + compressed);
    }
}
