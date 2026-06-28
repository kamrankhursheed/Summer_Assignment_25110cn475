package day_05;

  
   import java.util.Scanner;

public class check_strongnumber_18 {

    static int findFactorial(int x) {
        int factorial = 1;
        for (int i = 2; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("NO it is not a strong number");
            sc.close();
            return;
        }

        int tempNum = n;
        int newNum = 0;

        while (tempNum != 0) {
            newNum += findFactorial(tempNum % 10);
            tempNum /= 10;
        }

        if (newNum == n)
            System.out.println("YES it is a strong number");
        else
            System.out.println("NO it is not a strong number");

        sc.close();
    }
} 

