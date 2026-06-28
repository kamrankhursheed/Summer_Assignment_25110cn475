package day_12;

public class armstrong_num_function_46 {
                
    

    static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static boolean isArmstrong(int n, int totalDigits) {
        int newNum = 0;
        int tempNum = n;
        while (n != 0) {
            newNum += (int) Math.pow(n % 10, totalDigits);
            n /= 10;
        }
        return newNum == tempNum;
    }

    public static void main(String[] args) {

        int number = 153;
        int digitCount = countDigits(number);
        System.out.println(isArmstrong(number, digitCount));

    }
}
