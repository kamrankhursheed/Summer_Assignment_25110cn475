package day_04;
 
    import java.util.Scanner;

public class  armstrongnumber_in_range_16  {

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

    static boolean isArmstrongNumber(int num, int totalDigits) {
        if (num == 0)
            return true;
        int tempNum = num;
        int newNum = 0;
        while (tempNum != 0) {
            newNum += (int) Math.pow(tempNum % 10, totalDigits);
            tempNum /= 10;
        }
        return newNum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int digitsCount = countDigits(i);
            if (isArmstrongNumber(i, digitsCount))
                System.out.print(i + " ");
        }
        sc.close();
    }
}
