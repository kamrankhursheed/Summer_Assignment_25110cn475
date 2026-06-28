package day_07;
import java.util.Scanner;

public class recursive_sum_of_digits_27 {

    static int sumOfDigits(int number) {
        if (Math.abs(number) < 10)
            return number;
        return number % 10 + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int digitsSum = sumOfDigits(n);
        System.out.println(digitsSum);

        sc.close();
    }
}