package day_12;

public class perfect_num_function_48 {

    static boolean perfectNumber(int n) {
        int sum = 0;
        int i = 1;
        while (i < n) {
            if (n % i == 0)
                sum += i;
            i++;
        }
        return sum == n;
    }

    public static void main(String[] args) {

        int number = 54;
        System.out.println(perfectNumber(number));

    }
}
