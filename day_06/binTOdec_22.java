package day_06;


   import java.util.Scanner;

public class binTOdec_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number (zeroes and ones): ");
        int n = sc.nextInt();

        int decimal = 0;
        int multiplier = 1; // 1 i.e equals to 2 raised to the power 0

        while (n != 0) {
            decimal += (n % 10) * multiplier;
            multiplier *= 2;
            n /= 10;
        }

        System.out.println(decimal);
        sc.close();
    }
} 

