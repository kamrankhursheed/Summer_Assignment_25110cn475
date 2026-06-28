package day_07;
import java.util.Scanner;

public class recursive_fibonacci_26 {

    static int fibonacciElements(int term) {
        if (term == 1)
            return 0;
        if (term == 2)
            return 1;
        return fibonacciElements(term - 1) + fibonacciElements(term - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print(fibonacciElements(i) + " ");
        }

        System.out.println();
        sc.close();
    }
}