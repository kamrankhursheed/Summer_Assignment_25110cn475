package day_16;

import java.util.Scanner;

public class pairs_with_sum_equals_target_63 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 2, 7, 1, 8, 3, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the target sum for which pairs are required: ");
        int target = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if ((array[i] + array[j]) == target) {
                    System.out.print("(" + array[i] + "," + array[j] + ") ");
                }
            }
        }

        sc.close();
    }
}
