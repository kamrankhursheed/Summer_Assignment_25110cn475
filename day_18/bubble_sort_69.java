package day_18;

import java.util.Scanner;

public class bubble_sort_69 {

    static void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean is_swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    is_swapped = true;
                }
            }
            if (!is_swapped)
                break;
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

        bubble_sort(arr, n);

        System.out.print("sorted array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}
