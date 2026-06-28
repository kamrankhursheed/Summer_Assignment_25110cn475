package day_07;
import java.util.Scanner;

public class recursive_reverse_number_28 {

    static int countDigits(int n) {
        if (Math.abs(n) < 10)
            return 1;
        return 1 + countDigits(n / 10);
    }

    static int reverseNumber(int number) {
        if (Math.abs(number) < 10)
            return number;
        int digits = countDigits(number);
        return (number % 10) * (int) Math.pow(10, digits - 1)
                + reverseNumber(number / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int revNum = reverseNumber(n);
        System.out.println(revNum);

        sc.close();
    }
}