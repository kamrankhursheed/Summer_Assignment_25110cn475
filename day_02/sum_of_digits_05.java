package day_02;
import java.util.Scanner;

public class sum_of_digits_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.print("sum = " + sum);
        sc.close();
    }
}
