package day_05;


    import java.util.Scanner;

public class  largest_primefactor_20 {

    static boolean isPrime(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n);
            sc.close();
            return;
        }

        int answer = -1;
        for (int i = 2; n != 1; i++) {
            if (isPrime(i)) {
                while (n % i == 0) {
                    n /= i;
                    answer = i;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}

