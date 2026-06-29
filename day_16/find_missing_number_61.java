package day_16;

public class find_missing_number_61 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int ideal_sum = (10 * 11) / 2; // from sum to n numbers formula
        int actual_sum = 0;
        for (int x : array) {
            actual_sum += x;
        }
        System.out.println("the missing number is : " + (ideal_sum - actual_sum));
    }
}
