 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter the number up to which the sum has to be calculated: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);
        scanner.close();
    }
} 
    

