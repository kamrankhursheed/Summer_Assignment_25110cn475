package day_13;

public class array_sum_average_50 {

    public static void main(String[] args) {

        int[] arr = {10, 23, 45, 65, 34};
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        float average = sum / 5.0f;

        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + average);

    }
}
