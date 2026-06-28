package day_12;
public class palindrom_function_45 {

    static boolean isPalindrome(int n) {
        int original = n; // save original to compare later
        int revNum = 0;
        while (n != 0) {
            revNum = revNum * 10 + n % 10;
            n /= 10;
        }
        return revNum == original;
    }

    public static void main(String[] args) {

        int x = 1345431;
        System.out.println(isPalindrome(x));

    }
}
