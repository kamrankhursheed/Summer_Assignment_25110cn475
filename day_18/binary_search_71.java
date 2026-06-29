package day_18;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search_71 {

    static void my_binary_search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                System.out.println("element found");
                return;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("element not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size(no. of elements) of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("enter the target element: ");
        int target = sc.nextInt();

        my_binary_search(arr, target);

        sc.close();
    }
}
