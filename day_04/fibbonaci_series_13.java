package day_04;
import java.util.Scanner;

public class fibbonaci_series_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int f1 = 0;
        int f2 = 1;

        if (n == 1) {
            System.out.println(f1);
        } else if (n == 2) {
            System.out.println(f1 + " " + f2);
        } else {
            System.out.print(f1 + " " + f2 + " ");
            for (int i = 3; i <= n; i++) {
                System.out.print((f1 + f2) + " ");
                int temp = f1;
                f1 = f2;
                f2 = temp + f2;
            }
        }
        sc.close();
    }
}
    