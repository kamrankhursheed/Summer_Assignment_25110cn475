package day_05;

 
import java.util.Scanner;

public class  factor_of_number_19  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("infinite factors");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        sc.close();
    }
}