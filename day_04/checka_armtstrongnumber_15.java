package day_04;

 
import java.util.Scanner;

public class checka_armtstrongnumber_15 {
    
}

    static int countDigits(int x) {
        if (x == 0)
            return 1;
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Yes the given number is an armstrong number");
            sc.close();
            return;
        }

        int tempNum = n;
        int newNum = 0;
        int totalDigits = countDigits(n);

        while (tempNum != 0) {
            newNum += (int) Math.pow(tempNum % 10, totalDigits);
            tempNum /= 10;
        }

        if (newNum == n)
            System.out.println("Yes the given number is an armstrong number");
        else
            System.out.println("No the given number is not an armstrong number");

        sc.close();
    }
}