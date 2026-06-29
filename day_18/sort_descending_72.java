package day_18;

import java.util.Scanner;

public class sort_descending_72 {

    static void descending_sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && key > nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
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

        descending_sort(arr);

        System.out.print("sorted array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}
